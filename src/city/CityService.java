package city;

import city.model.City;

import java.util.List;

public interface CityService {
    List<City> getAll();

    City get(long id);

    void remove(long id);

    void add(City city);

    void update(City city);
}
