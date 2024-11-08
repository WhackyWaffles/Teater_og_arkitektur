package model;

public enum PladsType {
    STANDARD("Standard"),
    EKSTRABEN("Ekstra benplads"),
    KOERESTOL("Kørestol");

    private String name;

    PladsType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
