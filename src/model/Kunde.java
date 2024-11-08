package model;

import java.util.ArrayList;

public class Kunde {
    private String navn;
    private String mobil;
    private ArrayList<Bestilling> bestillinger = new ArrayList<>();

    public String getNavn() {
        return navn;
    }

    public String getMobil() {
        return mobil;
    }

    public ArrayList<Bestilling> getBestillinger() {
        return bestillinger;
    }
}