package robot.interfaces.impl;

import robot.interfaces.Hand;

public class SonyHand implements Hand {
    public void turnLeft() {
        System.out.println("Sony turn hand left");
    }

    public void turnRight() {
        System.out.println("Sony turn hand right");
    }
}
