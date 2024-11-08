package model1;

public enum PladsType {
    STANDARD("Standard"),
    EKSTRABEN("Ekstra ben "),
    KØRESTOL("Kørestol");

    private String name;

    PladsType(String name) {
        this.name = name;
    }

}
