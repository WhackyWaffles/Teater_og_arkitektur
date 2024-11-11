package model;

public class Plads {
    private int raekke;
    private int nr;
    private int pris;
    private PladsType pladsType;
    private String navn;

    public Plads(int raekke, int nr, int pris, PladsType pladsType) {
        this.raekke = raekke;
        this.nr = nr;
        this.pris = pris;
        this.pladsType = pladsType;
        this.navn = String.valueOf(raekke + 1) + "," + String.valueOf(nr + 1);
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

    public String getNavn() {
        return navn;
    }
}
