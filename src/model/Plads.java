package model;

public class Plads {
    private int raekke;
    private int nr;
    private int pris;
    private PladsType pladsType;

    public Plads(int raekke, int nr, int pris, PladsType pladsType) {
        this.raekke = raekke;
        this.nr = nr;
        this.pris = pris;
        this.pladsType = pladsType;
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
