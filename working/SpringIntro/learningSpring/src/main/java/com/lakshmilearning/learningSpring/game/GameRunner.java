package com.lakshmilearning.learningSpring.game;

public class GameRunner {
     private gameConsole gc;

     public GameRunner(gameConsole gc){
          this.gc = gc;
     }

     public void run (){
          System.out.println(" Running  Game .......");
          gc.up();
          gc.down();
          gc.right();
          gc.left();
     }
}
