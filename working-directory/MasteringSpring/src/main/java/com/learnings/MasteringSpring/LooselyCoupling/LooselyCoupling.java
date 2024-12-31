package com.learnings.MasteringSpring.LooselyCoupling;

import com.learnings.MasteringSpring.LooselyCoupling.GamingConsole.Game01;
import com.learnings.MasteringSpring.LooselyCoupling.GamingConsole.Game02;
import com.learnings.MasteringSpring.LooselyCoupling.GamingConsole.GameRunner;

public class LooselyCoupling {
    public static  void main(String[] args){
        var g1 = new Game01();
        var g2 = new Game02();
        var gameRunner = new GameRunner(g1);

        gameRunner.run();
        g2.jump();
    }
}
