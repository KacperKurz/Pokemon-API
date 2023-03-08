package pl.edu.ug.inf.kkurz.przemyslowe.pokemonAPI.domain;

public enum Category {
    PHYSICAL("Physical"),
    SPECIAL("Special"),
    STATUS("Status");

    private long id;
    private String name;

    Category(String name) {
        this.name = name;
    }

    Category() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                '}';
    }
}
