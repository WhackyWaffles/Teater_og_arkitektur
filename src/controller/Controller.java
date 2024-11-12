package controller;

import model.*;
import storage.Storage;

import java.time.LocalDate;
import java.util.ArrayList;

public class Controller {

    // -------------------------------------------------------------------------

    /**
     * Skaber en ny forestilling.<br />
     * @param navn for forestilling
     * @param startDato for forestillings begyndelse
     * @param slutDato for forestillings ophør
     * @return Et nyt Forestilling-objekt tilføjet til lager
     */
    public static Forestilling createForestilling(String navn, LocalDate startDato, LocalDate slutDato) {
        Forestilling forestilling = new Forestilling(navn, startDato, slutDato);
        Storage.addForestilling(forestilling);
        return forestilling;
    }

    /**
     * Getter for alle Forestillinger, der er gemt i Storage.
     */
    public static ArrayList<Forestilling> getForestillinger() {
        return Storage.getForestillinger();
    }

    // -------------------------------------------------------------------------

    /**
     * Skaber en ny kunde.<br />
     * @param navn for kunde
     * @param mobil for kunde
     */
    public static Kunde createKunde(String navn, String mobil) {
        Kunde kunde = new Kunde(navn, mobil);
        Storage.addKunde(kunde);
        return kunde;
    }

    /**
     * Getter for alle Kunder, der er gemt i Storage.
     */
    public static ArrayList<Kunde> getKunder() {
        return Storage.getKunder();
    }

    // -------------------------------------------------------------------------

    /**
     * Skaber en ny plads.<br />
     * @param række for plads
     * @param nr for plads
     * @param pris for plads
     * @param pladsType for plads
     */
    public static Plads createPlads(int række, int nr, int pris, PladsType pladsType) {
        Plads plads = new Plads(række, nr, pris, pladsType);
        Storage.addPlads(plads);
        return plads;
    }

    /**
     * Getter for alle Pladser, der er gemt i Storage.
     */
    public static ArrayList<Plads> getPladser(){
        return Storage.getPladser();
    }
    public static Bestilling opretBestillingMedPladser( Forestilling forestilling, Kunde kunde, LocalDate dato, ArrayList<Plads> pladser) {
        for (Plads plads : pladser) {
            
        }
        return null; 
    }
}
