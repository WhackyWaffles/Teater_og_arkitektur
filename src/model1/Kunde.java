package model1;

import java.util.ArrayList;

public class Kunde {
    private String navn;
    private String mobil;
    private ArrayList<Bestilling> bestillinger = new ArrayList<>();

    public Kunde(String navn, String mobil, ArrayList<Bestilling> bestillinger) {
        this.navn = navn;
        this.mobil = mobil;
        this.bestillinger = bestillinger;
    }

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
