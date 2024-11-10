package storage;

import model.Bestilling;
import model.Forestilling;
import model.Kunde;
import model.Plads;

import java.util.ArrayList;

public class Storage {
    private static ArrayList<Forestilling> forestillinger = new ArrayList<>();
    private static ArrayList<Bestilling> bestillinger = new ArrayList<>();
    private static ArrayList<Plads> pladser = new ArrayList<>();
    private static ArrayList<Kunde> kunder = new ArrayList<>();

    // -------------------------------------------------------------------------

    public static ArrayList<Forestilling> getForestillinger() {
        return new ArrayList<>(forestillinger);
    }

    public static void addForestilling(Forestilling forestilling) {
        forestillinger.add(forestilling);
    }

    public static void removeForestilling(Forestilling forestilling) {
        forestillinger.remove(forestilling);
    }

    // -------------------------------------------------------------------------

    public static ArrayList<Bestilling> getBestillinger() {
        return new ArrayList<>(bestillinger);
    }

    public static void addBestilling(Bestilling bestilling) {
        bestillinger.add(bestilling);
    }

    public static void removeBestilling(Bestilling bestilling) {
        bestillinger.remove(bestilling);
    }

    // -------------------------------------------------------------------------

    public static ArrayList<Plads> getPladser() {
        return new ArrayList<>(pladser);
    }

    public static void addPlads(Plads plads) {pladser.add(plads);}

    // public static void removePlads(Plads plads) {pladser.remove(plads);}

    // -------------------------------------------------------------------------

    public static ArrayList<Kunde> getKunder() {
        return new ArrayList<>(kunder);
    }

    public static void addKunde(Kunde kunde) {
        kunder.add(kunde);
    }

    public static void removeKunde(Kunde kunde) {
        kunder.remove(kunde);
    }
}
