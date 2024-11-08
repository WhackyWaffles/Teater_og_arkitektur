package model;

import java.time.LocalDate;

public class Bestilling {
    private LocalDate dato;
    private Forestilling forestilling;
    private Kunde kunde;
    private Plads[] pladser;

    public Bestilling(LocalDate dato, Kunde kunde, Forestilling forestilling, Plads[] pladser) {
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

    public Plads[] getPladser() {
        return pladser;
    }
}
