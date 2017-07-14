package com.tutorial.impl;

import com.tutorial.Knight;
import com.tutorial.Minstreal;
import com.tutorial.Quest;

public class BraveKnight implements Knight{
    private Quest quest;
    private Minstreal minstreal;

    public BraveKnight(Quest quest, Minstreal minstreal) {
        this.quest = quest;
        this.minstreal = minstreal;
    }

    public void embarkQuest() {
        this.minstreal.singBeforeQuest();
        this.quest.take();
        this.quest.perform();
        this.minstreal.singAfterQuest();
    }
}
