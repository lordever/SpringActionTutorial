package mvc.service;

import mvc.model.Spitter;

public class SpitterService {
    private Spitter spitter;

    public SpitterService() {
        spitter = new Spitter(25, "Anna");
    }

    public Spitter getSpitter(int defaultSpittlesPerPage) {
        if(spitter.getId() == defaultSpittlesPerPage)
            return spitter;
        else
            return new Spitter();
    }
}
