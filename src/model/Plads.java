package model;

public class Plads {
    private int raekke;
    private int nr;
    private int pris;
    private PladsType pladsType;

    public Plads(int nr, int raekke, PladsType pladsType, int pris) {
        this.nr = nr;
        this.raekke = raekke;
        this.pladsType = pladsType;
        this.pris = pris;
    }

    public int getRaekke() {
        return raekke;
    }

    public int getNr() {
        return nr;
    }

    public int getPris() {
        return pris;
    }

    public PladsType getPladsType() {
        return pladsType;
    }
}
