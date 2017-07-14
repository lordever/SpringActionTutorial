package com.tutorial;

import com.tutorial.impl.BraveKnight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BraveKnight braveKnight = (BraveKnight) context.getBean("knight");
        braveKnight.embarkQuest();
    }
}
