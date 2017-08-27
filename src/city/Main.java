package city;

import city.impl.CityServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("city/context.xml");
        CityServiceImpl cityService = (CityServiceImpl) context.getBean("cityService");

    }
}
