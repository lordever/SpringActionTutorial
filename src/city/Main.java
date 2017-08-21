package city;

import city.model.City;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("city/context.xml");
        City city = (City) context.getBean("city");
        System.out.println(city);
    }
}
