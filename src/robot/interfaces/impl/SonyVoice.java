package robot.interfaces.impl;

import robot.interfaces.Voice;

public class SonyVoice implements Voice {
    public void sing() {
        System.out.println("Sony is singing");
    }

    public void talk() {
        System.out.println("Sony is laking");
    }
}
