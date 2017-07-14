package com.tutorial.impl;

import com.tutorial.Quest;

public class DragonQuest implements Quest {
    public void take() {
        System.out.println("I'm take quest");
    }

    public void perform() {
        System.out.println("I'm performed quest");
    }

    public void cancel() {
        System.out.println("I'm canceled from quest");
    }
}
