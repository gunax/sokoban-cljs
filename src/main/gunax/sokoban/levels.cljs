(ns gunax.sokoban.levels)

(def levels  [{:level [[:open :open :wall :wall :wall :wall :wall :open]
                        [:wall :wall :wall :open :open :open :wall :open]
                        [:wall :open :open :open :wall :open :wall :wall]
                        [:wall :open :wall :open :open :target :open :wall]
                        [:wall :open :open :open :open :wall :open :wall]
                        [:wall :wall :open :wall :open :open :open :wall]
                        [:open :wall :open :open :open :wall :wall :wall]
                        [:open :wall :wall :wall :wall :wall :open :open]]
                :positions {:player [6 3]
                            :blocks #{[2 2]}}}

              {:level [[:open :wall :wall :wall :wall :wall :wall] 
                       [:wall :wall :open :open :target :open :wall] 
                       [:wall :open :target :open :wall :open :wall] 
                       [:wall :open :target :open :open :open :wall] 
                       [:wall :open :open :wall :open :wall :wall] 
                       [:wall :wall :open :open :open :wall :open] 
                       [:open :wall :wall :wall :wall :wall :open]], 
               :positions {:player [5 4], :blocks #{[2 2] [3 3] [4 4]}}}

              {:level 
               [[:wall :wall :wall :wall :wall :wall :wall] 
                [:wall :open :open :target :open :open :wall] 
                [:wall :open :wall :target :wall :open :wall] 
                [:wall :open :open :open :open :open :wall] 
                [:wall :target :open :open :open :wall :wall] 
                [:wall :open :open :wall :wall :wall :open] 
                [:wall :wall :wall :wall :open :open :open]], 
               :positions {:player [1 4], :blocks #{[3 4] [4 3] [4 2]}}}

              {:level [[:open :open :open :wall :wall :wall :wall] [:wall :wall :wall :wall :open :open :wall] [:wall :open :open :target :open :open :wall] [:wall :open :open :open :open :open :wall] [:wall :wall :open :target :wall :wall :wall] [:open :wall :open :open :wall :open :open] [:open :wall :open :target :wall :open :open] [:open :wall :wall :wall :wall :open :open]], 
               :positions {:player [1 5], :blocks #{[2 4] [2 3] [5 2]}}}

              {:level [[:wall :wall :wall :open :wall :wall :wall] [:wall :target :wall :wall :wall :target :wall] [:wall :open :wall :open :open :target :wall] [:wall :open :open :open :open :open :wall] [:wall :open :open :open :open :open :wall] [:wall :open :open :wall :open :open :wall] [:wall :open :open :wall :wall :wall :wall] [:wall :wall :wall :wall :open :open :open]], 
               :positions {:player [3 5], :blocks #{[3 3] [4 3] [3 2]}}}

              {:level [[:open :open :open :wall :wall :wall :wall :open] [:open :open :open :wall :open :open :wall :wall] [:wall :wall :wall :wall :open :open :open :wall] [:wall :target :open :wall :open :open :open :wall] [:wall :open :open :open :open :open :wall :wall] [:wall :target :open :open :open :wall :wall :open] [:wall :wall :target :open :open :wall :open :open] [:open :wall :wall :wall :wall :wall :open :open]], :positions 
               {:player [1 5], :blocks #{[3 5] [3 4] [5 5]}}}

              {:level [[:wall :wall :wall :wall :wall :open :open :open] [:wall :open :target :target :wall :wall :wall :wall] [:wall :open :open :open :open :open :open :wall] [:wall :open :open :wall :open :wall :open :wall] [:wall :open :open :open :target :open :open :wall] [:wall :wall :wall :wall :wall :wall :wall :wall]], 
               :positions {:player [4 2], :blocks #{[2 2] [3 5] [4 6]}}}

              {:level [[:open :open :wall :wall :wall :wall :wall] [:wall :wall :wall :open :open :target :wall] [:wall :open :open :open :wall :open :wall] [:wall :open :target :open :open :open :wall] [:wall :open :target :wall :open :open :wall] [:wall :open :open :open :open :wall :wall] [:wall :open :open :open :wall :wall :open] [:wall :wall :wall :wall :wall :open :open]],
               :positions {:player [4 4], :blocks #{[3 3] [4 3] [4 4]}}}

              {:level [[:wall :wall :wall :wall :wall :wall :wall :open] [:wall :target :open :open :open :target :wall :open] [:wall :open :open :open :wall :open :wall :wall] [:wall :open :wall :open :open :target :open :wall] [:wall :open :open :open :open :wall :open :wall] [:wall :wall :wall :wall :open :open :open :wall] [:open :open :open :wall :wall :wall :wall :wall]], 
               :positions {:player [1 4], :blocks #{[2 3] [3 4] [4 4]}}}

              {:level [[:wall :wall :wall :wall :wall :open :open] [:wall :target :open :target :wall :wall :wall] [:wall :target :wall :open :open :open :wall] [:wall :open :open :open :open :open :wall] [:wall :open :open :wall :open :open :wall] [:wall :wall :open :open :open :wall :wall] [:open :wall :wall :wall :wall :wall :open]], 
               :positions {:player [3 4], :blocks #{[2 4] [2 3] [4 2]}}}

              {:level [[:wall :wall :wall :wall :wall :open :open] [:wall :target :open :open :wall :wall :wall] [:wall :open :wall :open :open :open :wall] [:wall :open :target :open :wall :open :wall] [:wall :open :open :target :open :open :wall] [:wall :wall :open :open :wall :wall :wall] [:open :wall :open :open :wall :open :open] [:open :wall :wall :wall :wall :open :open]], 
               :positions {:player [5 3], :blocks #{[4 3] [4 4] [4 5]}}}

              {:level [[:wall :wall :wall :wall :wall :wall :wall :wall] [:wall :target :open :open :open :target :open :wall] [:wall :open :wall :open :wall :open :open :wall] [:wall :open :open :open :open :open :target :wall] [:wall :wall :wall :wall :wall :open :open :wall] [:open :open :open :open :wall :open :open :wall] [:open :open :open :open :wall :wall :wall :wall]], 
               :positions {:player [3 1], :blocks #{[3 2] [3 5] [4 6]}}}

              ;;12
              {:level [[:wall :wall :wall :wall :open :open :open :open] [:wall :open :open :wall :open :open :open :open] [:wall :open :open :wall :wall :wall :wall :wall] [:wall :open :target :target :open :open :open :wall] [:wall :wall :open :open :open :open :open :wall] [:open :wall :open :wall :open :wall :wall :wall] [:open :wall :target :open :open :wall :open :open] [:open :wall :wall :wall :wall :wall :open :open]]
               :positions {:player [6 4], :blocks #{[5 4] [4 2] [3 3]}}}

              {:level [[:open :wall :wall :wall :wall :wall :open :open] [:open :wall :open :open :open :wall :wall :wall] [:wall :wall :open :target :open :open :open :wall] [:wall :target :open :open :target :open :open :wall] [:wall :wall :open :wall :open :wall :wall :wall] [:open :wall :open :open :open :wall :open :open] [:open :wall :wall :wall :wall :wall :open :open]], 
               :positions {:player [1 3], :blocks #{[3 3] [3 5] [4 2]}}}

              ;;14
              {:level [[:open :wall :wall :wall :wall :wall :open] [:wall :wall :open :open :open :wall :open] [:wall :open :open :wall :open :wall :open] [:wall :open :target :open :open :wall :wall] [:wall :open :target :open :open :open :wall] [:wall :wall :open :wall :open :open :wall] [:open :wall :target :open :open :wall :wall] [:open :wall :wall :wall :wall :wall :open]], 
               :positions {:player [3 4], :blocks #{[2 2] [5 2] [6 5]}}}

              {:level [[:open :wall :wall :wall :wall :open :open :open] [:wall :wall :open :open :wall :wall :wall :wall] [:wall :target :target :open :open :open :target :wall] [:wall :open :wall :open :open :open :open :wall] [:wall :open :open :open :wall :open :open :wall] [:wall :wall :wall :wall :wall :open :open :wall] [:open :open :open :open :wall :wall :wall :wall]], 
               :positions {:player [4 1], :blocks #{[2 3] [3 3] [3 5]}}}

              {:level [[:open :wall :wall :wall :wall :wall :wall :open] [:open :wall :open :open :target :open :wall :wall] [:open :wall :open :open :open :open :target :wall] [:open :wall :wall :wall :target :wall :open :wall] [:wall :wall :open :open :open :open :open :wall] [:wall :open :open :open :open :open :wall :wall] [:wall :open :open :open :wall :wall :wall :open] [:wall :wall :wall :wall :wall :open :open :open]]
               :positions {:player [1 5], :blocks #{[2 5] [3 4] [5 3]}}}

              ;;17
              {:level [[:open :wall :wall :wall :wall :open :open :open] [:open :wall :open :open :wall :open :open :open] [:open :wall :open :open :wall :open :open :open] [:wall :wall :target :open :wall :wall :wall :wall] [:wall :open :open :open :target :open :target :wall] [:wall :open :open :open :open :wall :wall :wall] [:wall :wall :wall :open :open :wall :open :open] [:open :open :wall :wall :wall :wall :open :open]]
               :positions {:player [1 2], :blocks #{[4 2] [4 3] [5 3]}}}

              {:level [[:wall :wall :wall :wall :wall :open :open] [:wall :target :open :open :wall :open :open] [:wall :open :wall :open :wall :wall :wall] [:wall :open :target :open :open :open :wall] [:wall :open :open :open :target :open :wall] [:wall :open :open :open :wall :wall :wall] [:wall :wall :wall :wall :wall :open :open]], 
               :positions {:player [5 3], :blocks #{[4 3] [3 3] [3 2]}}}

              {:level [[:open :open :wall :wall :wall :wall :wall] [:open :open :wall :open :open :open :wall] [:open :open :wall :open :wall :target :wall] [:wall :wall :wall :open :open :target :wall] [:wall :open :open :open :open :open :wall] [:wall :open :open :target :open :open :wall] [:wall :wall :wall :wall :wall :wall :wall]], 
               :positions {:player [4 1], :blocks #{[4 3] [4 4] [5 4]}}}

              {:level [[:wall :wall :wall :wall :wall :wall :open :open] [:wall :open :open :open :open :wall :open :open] [:wall :open :open :wall :open :wall :wall :wall] [:wall :open :target :open :open :open :open :wall] [:wall :open :open :open :wall :wall :open :wall] [:wall :wall :target :open :open :target :open :wall] [:open :wall :wall :open :open :open :wall :wall] [:open :open :wall :wall :wall :wall :wall :open]]
               :positions {:player [1 5], :blocks #{[2 2] [4 3] [4 5]}}}

              ;;21
              {:level [[:wall :wall :wall :wall :wall :wall :open] [:wall :open :open :open :open :wall :wall] [:wall :open :open :wall :open :open :wall] [:wall :target :open :open :open :open :wall] [:wall :open :open :open :wall :target :wall] [:wall :wall :wall :open :open :target :wall] [:open :open :wall :wall :wall :wall :wall]], 
               :positions {:player [1 4], :blocks #{[3 4] [4 3] [4 2]}}}

              {:level [[:open :open :wall :wall :wall :wall :open :open] [:wall :wall :wall :target :open :wall :open :open] [:wall :open :target :open :open :wall :wall :wall] [:wall :open :open :open :open :open :open :wall] [:wall :wall :open :target :open :open :open :wall] [:open :wall :wall :wall :wall :wall :wall :wall]], 
               :positions {:player [4 6], :blocks #{[4 5] [3 5] [3 4]}}}

              {:level [[:open :wall :wall :wall :wall :wall :wall :open] [:wall :wall :open :target :open :open :wall :open] [:wall :open :open :open :target :open :wall :open] [:wall :open :open :wall :open :open :wall :wall] [:wall :open :open :wall :open :open :target :wall] [:wall :wall :wall :wall :open :wall :open :wall] [:open :open :open :wall :open :open :open :wall] [:open :open :open :wall :wall :wall :wall :wall]]
               :positions {:player [1 2], :blocks #{[2 2] [2 3] [2 4]}}}

              ;;24
              {:level [[:open :open :open :open :wall :wall :wall :wall] [:open :open :open :open :wall :open :open :wall] [:open :open :wall :wall :wall :open :target :wall] [:open :open :wall :open :open :target :open :wall] [:wall :wall :wall :open :open :wall :target :wall] [:wall :open :open :open :open :open :open :wall] [:wall :open :open :open :wall :open :open :wall] [:wall :wall :wall :wall :wall :wall :wall :wall]]
               :positions {:player [6 5], :blocks #{[5 5] [5 2] [2 5]}}}

              {:level [[:wall :wall :wall :wall :wall :open :open :open] [:wall :open :open :target :wall :wall :wall :open] [:wall :open :open :target :target :open :wall :open] [:wall :open :open :wall :wall :open :wall :wall] [:wall :wall :open :open :wall :open :open :wall] [:open :wall :open :open :open :open :open :wall] [:open :wall :open :open :wall :wall :wall :wall] [:open :wall :wall :wall :wall :open :open :open]]
               :positions {:player [5 6], :blocks #{[5 2] [2 2] [3 5]}}}

              {:level [[:open :open :wall :wall :wall :wall :open :open] [:open :open :wall :open :open :wall :open :open] [:open :open :wall :open :open :wall :wall :wall] [:wall :wall :wall :open :target :target :open :wall] [:wall :open :open :open :wall :open :open :wall] [:wall :open :open :target :open :open :open :wall] [:wall :wall :wall :wall :open :open :open :wall] [:open :open :open :wall :wall :wall :wall :wall]], :positions {:player [6 5], :blocks #{[5 5] [5 4] [4 3]}}}

              {:level [[:wall :wall :wall :wall :wall :open :open :open] [:wall :open :open :open :wall :wall :wall :open] [:wall :open :wall :open :target :open :wall :wall] [:wall :open :open :target :open :open :open :wall] [:wall :wall :wall :open :open :open :open :wall] [:open :open :wall :open :open :open :target :wall] [:open :open :wall :wall :wall :wall :wall :wall]], 
               :positions {:player [2 5], :blocks #{[2 4] [3 3] [4 3]}}}

              ;;28
              {:level [[:open :open :wall :wall :wall :wall :wall :wall] [:wall :wall :wall :open :target :open :open :wall] [:wall :open :open :open :wall :target :open :wall] [:wall :open :open :open :wall :open :wall :wall] [:wall :open :open :target :open :open :wall :open] [:wall :wall :open :open :wall :open :wall :open] [:open :wall :wall :open :open :open :wall :open] [:open :open :wall :wall :wall :wall :wall :open]], 
               :positions {:player [2 3], :blocks #{[2 2] [3 3] [4 3]}}}

              {:level [[:open :wall :wall :wall :wall :open :open :open] [:wall :wall :open :open :wall :wall :wall :open] [:wall :open :open :open :open :open :wall :wall] [:wall :open :open :wall :open :open :open :wall] [:wall :open :open :target :open :target :target :wall] [:wall :wall :wall :wall :wall :wall :wall :wall]], 
               :positions {:player [3 6], :blocks #{[3 5] [3 4] [4 5]}}}

              {:level [[:open :wall :wall :wall :wall :wall :wall :wall] [:wall :wall :open :open :open :open :open :wall] [:wall :target :open :wall :open :open :open :wall] [:wall :open :open :open :open :target :wall :wall] [:wall :open :target :wall :open :open :wall :open] [:wall :open :open :wall :wall :wall :wall :open] [:wall :wall :wall :wall :open :open :open :open]], 
               :positions {:player [1 2], :blocks #{[3 2] [3 3] [3 4]}}}

              ;;31
              {:level [[:wall :wall :wall :wall :wall :wall :wall :wall] [:wall :open :open :open :open :open :open :wall] [:wall :open :wall :open :wall :wall :target :wall] [:wall :open :wall :open :open :open :open :wall] [:wall :target :open :open :target :open :open :wall] [:wall :wall :wall :wall :wall :open :open :wall] [:open :open :open :open :wall :open :open :wall] [:open :open :open :open :wall :wall :wall :wall]], 
               :positions {:player [3 3], :blocks #{[4 2] [3 5] [2 6]}}}

              {:level [[:open :wall :wall :wall :wall :wall :wall :open] [:open :wall :open :open :open :open :wall :wall] [:open :wall :wall :open :open :open :open :wall] [:wall :wall :wall :open :target :open :open :wall] [:wall :open :open :open :wall :open :wall :wall] [:wall :open :target :open :open :target :wall :open] [:wall :wall :wall :wall :open :open :wall :open] [:open :open :open :wall :wall :wall :wall :open]], 
               :positions {:player [1 2], :blocks #{[2 3] [4 2] [4 5]}}}

              {:level [[:wall :wall :wall :wall :wall :open :open] [:wall :open :open :open :wall :wall :wall] [:wall :open :open :open :open :open :wall] [:wall :wall :open :open :open :target :wall] [:open :wall :open :open :target :open :wall] [:open :wall :wall :open :wall :open :wall] [:open :open :wall :open :open :target :wall] [:open :open :wall :wall :wall :wall :wall]], 
               :positions {:player [4 2], :blocks #{[3 2] [3 3] [2 3]}}}

              {:level [[:wall :wall :wall :wall :wall :open :open :open] [:wall :open :open :open :wall :wall :wall :wall] [:wall :open :open :open :open :open :open :wall] [:wall :open :target :wall :target :open :open :wall] [:wall :open :open :wall :wall :open :wall :wall] [:wall :open :open :wall :wall :open :wall :open] [:wall :open :open :open :open :target :wall :open] [:wall :wall :wall :wall :wall :wall :wall :open]], 
               :positions {:player [6 2], :blocks #{[2 2] [2 3] [5 5]}}}

              {:level [[:wall :wall :wall :wall :wall :wall :open :open] [:wall :open :target :open :open :wall :open :open] [:wall :open :target :wall :open :wall :wall :wall] [:wall :open :open :open :open :open :open :wall] [:wall :open :open :target :open :open :open :wall] [:wall :wall :wall :wall :wall :wall :wall :wall]], 
               :positions {:player [3 2], :blocks #{[4 2] [3 3] [3 4]}}}

              {:level [[:wall :wall :wall :wall :wall :wall :wall :wall] [:wall :open :open :target :wall :open :open :wall] [:wall :open :target :open :open :target :open :wall] [:wall :open :open :wall :open :open :open :wall] [:wall :open :open :open :open :open :wall :wall] [:wall :wall :wall :open :open :wall :wall :open] [:open :open :wall :open :open :wall :open :open] [:open :open :wall :wall :wall :wall :open :open]], 
               :positions {:player [1 2], :blocks #{[2 3] [3 4] [4 3]}}}

              ;;37
              {:level [[:open :wall :wall :wall :wall :wall :wall :wall] [:wall :wall :open :open :open :target :open :wall] [:wall :open :open :open :open :open :open :wall] [:wall :target :open :target :wall :wall :wall :wall] [:wall :open :open :wall :wall :open :open :open] [:wall :open :open :wall :open :open :open :open] [:wall :open :open :wall :open :open :open :open] [:wall :wall :wall :wall :open :open :open :open]], 
               :positions {:player [2 6], :blocks #{[2 2] [3 2] [2 5]}}}

              {:level [[:wall :wall :wall :wall :wall :wall :open] [:wall :open :target :open :open :wall :open] [:wall :open :open :wall :open :wall :open] [:wall :open :open :open :open :wall :wall] [:wall :wall :open :wall :open :open :wall] [:wall :open :open :open :wall :open :wall] [:wall :target :open :target :open :open :wall] [:wall :wall :wall :wall :wall :wall :wall]], 
               :positions {:player [2 4], :blocks #{[3 3] [4 2] [6 3]}}}

              {:level [[:open :open :open :wall :wall :wall :wall :wall] [:wall :wall :wall :wall :open :target :open :wall] [:wall :open :target :open :open :target :open :wall] [:wall :open :open :open :wall :open :open :wall] [:wall :open :wall :open :open :open :open :wall] [:wall :open :open :open :wall :wall :wall :wall] [:wall :wall :wall :wall :wall :open :open :open]], 
               :positions {:player [2 3], :blocks #{[2 2] [3 2] [4 5]}}}

              {:level [[:open :open :wall :wall :wall :wall :open :open] [:wall :wall :wall :open :open :wall :wall :wall] [:wall :open :target :target :open :open :target :wall] [:wall :open :open :open :open :open :open :wall] [:wall :wall :wall :wall :open :open :open :wall] [:open :open :open :wall :wall :wall :wall :wall]], 
               :positions {:player [3 6], :blocks #{[2 5] [3 4] [3 3]}}}

              {:level [[:open :open :open :open :wall :wall :wall :wall] [:open :open :open :open :wall :open :open :wall] [:wall :wall :wall :wall :wall :open :target :wall] [:wall :open :open :open :open :open :open :wall] [:wall :open :open :open :target :open :open :wall] [:wall :wall :wall :open :target :open :open :wall] [:open :open :wall :wall :wall :wall :wall :wall]], 
               :positions {:player [1 5], :blocks #{[3 2] [3 4] [3 6]}}}

              ;;42
              {:level [[:wall :wall :wall :wall :wall :wall :wall :wall] [:wall :open :open :open :wall :open :open :wall] [:wall :open :wall :target :open :open :open :wall] [:wall :open :open :open :open :open :open :wall] [:wall :wall :wall :wall :wall :target :open :wall] [:open :open :wall :open :open :open :open :wall] [:open :open :wall :open :open :open :target :wall] [:open :open :wall :wall :wall :wall :wall :wall]], :positions {:player [0 0], :blocks #{[0 1]}}}
{:level [[:open :open :open :wall :wall :wall :wall :open] [:open :open :wall :wall :open :open :wall :wall] [:open :wall :wall :open :open :target :target :wall] [:wall :wall :open :open :wall :open :wall :wall] [:wall :open :open :open :open :target :open :wall] [:wall :open :open :wall :open :open :open :wall] [:wall :open :open :open :open :wall :wall :wall] [:wall :wall :wall :wall :wall :wall :open :open]], :positions {:player [0 0], :blocks #{[0 1]}}}
{:level [[:wall :wall :wall :wall :wall :wall :open :open] [:wall :open :open :open :open :wall :open :open] [:wall :open :open :open :wall :wall :wall :wall] [:wall :open :open :open :target :open :open :wall] [:wall :wall :open :wall :target :wall :open :wall] [:wall :target :open :open :open :wall :open :wall] [:wall :open :open :open :open :open :open :wall] [:wall :wall :wall :wall :wall :wall :wall :wall]], :positions {:player [0 0], :blocks #{[0 1]}}}
{:level [[:open :open :open :wall :wall :wall :wall :open] [:open :open :open :wall :open :open :wall :open] [:wall :wall :wall :wall :open :open :wall :wall] [:wall :open :open :open :target :open :open :wall] [:wall :open :wall :wall :open :open :open :wall] [:wall :open :open :open :wall :wall :open :wall] [:wall :open :open :open :target :open :target :wall] [:wall :wall :wall :wall :wall :wall :wall :wall]], :positions {:player [0 0], :blocks #{[0 1]}}}
{:level [[:open :open :open :wall :wall :wall :wall :wall] [:open :open :open :wall :open :open :open :wall] [:open :wall :wall :wall :open :open :open :wall] [:open :wall :open :open :open :open :wall :wall] [:wall :wall :open :open :open :open :wall :open] [:wall :target :open :open :wall :open :wall :open] [:wall :target :target :open :open :open :wall :open] [:wall :wall :wall :wall :wall :wall :wall :open]], :positions {:player [0 0], :blocks #{[0 1]}}}
{:level [[:open :open :open :wall :wall :wall :wall :wall] [:wall :wall :wall :wall :target :open :open :wall] [:wall :open :open :target :open :open :open :wall] [:wall :open :wall :open :open :wall :wall :wall] [:wall :open :open :open :open :open :target :wall] [:wall :wall :wall :wall :open :open :open :wall] [:open :open :open :wall :wall :wall :wall :wall]], :positions {:player [0 0], :blocks #{[0 1]}}}
{:level [[:wall :wall :wall :wall :wall :wall :wall :wall] [:wall :open :open :target :wall :open :open :wall] [:wall :open :wall :open :open :open :open :wall] [:wall :open :open :target :wall :open :open :wall] [:wall :wall :open :target :open :open :open :wall] [:open :wall :open :open :wall :wall :wall :wall] [:open :wall :wall :wall :wall :open :open :open]], :positions {:player [0 0], :blocks #{[0 1]}}}
{:level [[:wall :wall :wall :wall :wall :wall :wall] [:wall :open :open :open :open :open :wall] [:wall :target :wall :wall :open :target :wall] [:wall :target :open :open :open :open :wall] [:wall :open :open :wall :open :open :wall] [:wall :open :open :wall :open :open :wall] [:wall :wall :wall :wall :wall :wall :wall]], :positions {:player [0 0], :blocks #{[0 1]}}}
{:level [[:wall :wall :wall :wall :open :open :open :open] [:wall :target :open :wall :open :open :open :open] [:wall :open :open :wall :open :open :open :open] [:wall :open :open :wall :wall :wall :wall :wall] [:wall :open :target :open :open :open :open :wall] [:wall :open :target :open :open :wall :open :wall] [:wall :wall :wall :open :open :open :open :wall] [:open :open :wall :wall :wall :wall :wall :wall]], :positions {:player [0 0], :blocks #{[0 1]}}}
{:level [[:wall :wall :wall :wall :wall :wall :wall :wall] [:wall :open :open :open :open :open :open :wall] [:wall :open :wall :open :open :open :open :wall] [:wall :open :open :open :open :wall :target :wall] [:wall :wall :open :wall :target :open :open :wall] [:open :wall :open :open :open :open :target :wall] [:open :wall :wall :wall :wall :wall :wall :wall]], :positions {:player [0 0], :blocks #{[0 1]}}}
{:level [[:wall :wall :wall :wall :wall :wall :open :open] [:wall :open :open :target :open :wall :open :open] [:wall :open :open :open :open :wall :wall :wall] [:wall :open :wall :open :open :target :open :wall] [:wall :target :open :open :wall :wall :open :wall] [:wall :open :open :open :wall :wall :open :wall] [:wall :wall :wall :open :open :open :open :wall] [:open :open :wall :wall :wall :wall :wall :wall]], :positions {:player [0 0], :blocks #{[0 1]}}}

])
