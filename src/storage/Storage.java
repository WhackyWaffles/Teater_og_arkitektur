package storage;

import model.Bestilling;
import model.Forestilling;
import model.Kunde;
import model.Plads;

import java.util.ArrayList;

public class Storage {
    private static ArrayList<Forestilling> forestillinger = new ArrayList<>();
    //private static ArrayList<Bestilling> bestillinger = new ArrayList<>();
    private static ArrayList<Kunde> kunder = new ArrayList<>();
    private static ArrayList<Plads> pladser = new ArrayList<>();

    //------------------------------------------------------------------------
    //Add Methods to Forestilling, Plads, Kunde
    public static void addForestilling(Forestilling forestilling) {
        forestillinger.add(forestilling);
    }
    public static void addKunde(Kunde kunde) {
        kunder.add(kunde);
    }
    public static void addPlads(Plads plads) {
        pladser.add(plads);
    }
}
