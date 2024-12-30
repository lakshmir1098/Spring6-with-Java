package com.lakshmilearning.learningSpring;

import com.lakshmilearning.learningSpring.game.Game01;
import com.lakshmilearning.learningSpring.game.Game02;
import com.lakshmilearning.learningSpring.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GamingConsole {
    public static void main(String[] args) {
        var g1 = new Game01();
        var g2 = new Game02();
        var gameRunner = new GameRunner(g2);

        gameRunner.run();
        g2.jump();
    }
}
