package robot.interfaces.impl;

import robot.interfaces.Hand;

public class ToshibaHand implements Hand {
    public void turnLeft() {
        System.out.println("Toshiba turn hand left");
    }

    public void turnRight() {
        System.out.println("Toshiba turn hand right");
    }
}
