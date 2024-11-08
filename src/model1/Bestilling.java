package model1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bestilling {
    private LocalDate dato;
    private Forestilling forestilling;
    private Plads [] pladser;
    private Kunde kunde;

    public Bestilling(LocalDate dato, Forestilling forestilling, Plads[] pladser, Kunde kunde) {
        this.dato = dato;
        this.forestilling = forestilling;
        this.pladser = pladser;
        this.kunde = kunde;
    }

    public LocalDate getDato() {
        return dato;
    }

    public Forestilling getForestilling() {
        return forestilling;
    }

    public Plads[] getPladser() {
        return pladser;
    }

    public Kunde getKunde() {
        return kunde;
    }
}
