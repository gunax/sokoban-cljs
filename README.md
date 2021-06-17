# sokoban-cljs
Classic [Japanese game](https://en.wikipedia.org/wiki/Sokoban) in Clojurescript/reagent

This is basically a big experiment using completely stateful/functional style to represent a game. Each move by the player has to adjust the game state in a deterministic fashion.

You are the CYAN block

The blocks are the YELLOW blocks

Destinations are the MAGENTA blocks

Move using arrow keys

## Install

```
git clone https://github.com/gunax/sokoban-cljs .
```
Build and run with:
```
npx shadow-cljs watch game
```
Or start a REPL (requires shadow-cljs):
```
shadow-cljs cljs-repl game
```

Game will load on http://localhost:8080/

![sokoban-cljs!](https://github.com/gunax/sokoban-cljs/blob/main/screenshots/sokoban.png?raw=true)
