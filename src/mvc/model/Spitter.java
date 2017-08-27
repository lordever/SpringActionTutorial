package mvc.model;

public class Spitter {
    private int id;
    private String name;

    public Spitter(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Spitter() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
