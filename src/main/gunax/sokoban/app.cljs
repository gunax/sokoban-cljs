(ns gunax.sokoban.app
  (:require [reagent.core :as r]
            [reagent.dom :as rd]
            [gunax.sokoban.levels :as levels]))


(def grid-sq-type
  {:open {:color "grey" :passable true}
   :wall {:color "black" :passable false}
   :target {:color "yellow" :passable true}
   :block {:color "violet" :passable true}
   :player {:color "cyan" :passable false}
   :target-block {:color "blue" :passable true}})

(def move-count (r/atom 0))
(def level-num (r/atom 1))
(def the-grid (r/atom (get-in levels/levels [@level-num :level])))
(def positions (r/atom (list (get-in levels/levels [@level-num :positions]))))

(defn create-real-grid [grid movables]
  "Combine a static grid and a set of moveables to create the actual grid locations"
  (loop [grid (assoc-in grid (:player movables) :player)
         blocks (:blocks movables)]
    (if (empty? blocks)
      grid
      (recur (assoc-in grid (first blocks) :block) (rest blocks) ))))

(defn grid-sq [type]
  [:div {:style {:background (get-in grid-sq-type [type :color])}}])

(defn grid [{width :width height :height}]
  (let [rows (count @the-grid)
        cols (count (first @the-grid))]
    [:div {:style {:display "grid"
                   :grid-template-columns (str "repeat(" cols ", 1fr)")
                   :grid-template-rows (str "repeat(" rows ",1fr)")
                   :width width
                   :height height}
           }
     (let [ind (atom 0)] ;;unique keys by index (react requirement)
       (for [row (create-real-grid @the-grid (first @positions))
             col row
             :let [i (swap! ind inc)]]
         ^{:key i}
         [grid-sq col]))]))

;;assumes the move is valid, so must verify first
(defn move [dir]
  (let [pos (atom (first @positions))
        player-pos (map + dir (:player @pos))]
    (swap! move-count inc)
    (swap! pos assoc :player player-pos);; move player
    (if (contains? (:blocks @pos) player-pos) 
      (let [block-pos (map + dir player-pos)]
        (swap! pos assoc :blocks (disj (:blocks @pos) player-pos))
        (swap! pos assoc :blocks (conj (:blocks @pos) block-pos))))
    (swap! positions #(cons @pos %))))

(defn undo-move []
  (if (some? (next @positions))
    (do
      (swap! move-count dec)
      (swap! positions rest))))

(defn try-move [dir]
  (let [old-board (create-real-grid @the-grid (first @positions)) 
        new-pos (map + dir (:player (first @positions)))
        dest-sq-type (get-in old-board new-pos)
        two-away-sq-type (get-in old-board (map + dir new-pos))]
    (case dest-sq-type ;;check if this is a valid move
      (:open :target) (move dir) ;;open space, so move
      :block (case two-away-sq-type ;;block is in the way, check if it can be pushed
               (:open :target) (move dir) ;;block can be pushed
               ()) ;;block is blocked
      () ;;wall or out of bounds
)))

;; run on page load
(defn init []
  (.addEventListener js/document "keydown" #(case (.-code %)
                                              "ArrowDown" (try-move [1 0])
                                              "ArrowUp" (try-move [-1 0])
                                              "ArrowLeft" (try-move [0 -1])
                                              "ArrowRight" (try-move [0 1])
                                              "Backspace" (undo-move)
                                              ())))

(defn game []
  [:div
   [grid {:width 250 :height 250 :rows 8 :cols 8}]
   [:div (str "Moves: " @move-count)]])

;; Attach to the dom
(rd/render
 [game]
 (.getElementById js/document "root"))

