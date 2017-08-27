package robot;

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
    }
}
