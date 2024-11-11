package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bestilling {
    private LocalDate dato;
    private Forestilling forestilling;
    private Kunde kunde;
    private ArrayList<Plads> pladser = new ArrayList<>();

    public Bestilling(LocalDate dato, Kunde kunde, Forestilling forestilling, ArrayList<Plads> pladser) {
        this.dato = dato;
        this.kunde = kunde;
        this.forestilling = forestilling;
        this.pladser = pladser;
    }

    public LocalDate getDato() {
        return dato;
    }

    public Forestilling getForestilling() {
        return forestilling;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public ArrayList<Plads> getPladser() {
        return pladser;
    }
}