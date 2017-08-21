package disk;

import city.CityService;
import city.model.City;
import city.sessionbean.CitySessionBean;

public class Main {
    public static void main(String[] args) {
        CitySessionBean sessionBean = new CitySessionBean();

        CityService service = sessionBean.cityService();

        for (City city : service.getAll()) {
            System.out.println(city);
        }
        System.out.println("-----------------");

        City city = new City(5, "City_5", "City_5", 10);

        service.add(city);

        for (City cityObj : service.getAll()) {
            System.out.println(cityObj);
        }
        System.out.println("-----------------");

        CitySessionBean sessionBean2 = new CitySessionBean();

        CityService service2 = sessionBean2.cityService();
        System.out.println("Second Object");
        for (City cityObj : service.getAll()) {
            System.out.println(cityObj);
        }

    }
}
