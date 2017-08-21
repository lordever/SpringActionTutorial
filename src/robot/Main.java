package robot;

import robot.model.Robot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("robot/bean.xml");
        Robot sonyRobot = (Robot) context.getBean("sonyRobot");
        sonyRobot.getHand().turnLeft();
    }
}
