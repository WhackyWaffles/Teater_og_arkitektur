package controller;

import model.Forestilling;
import model.Kunde;
import model.Plads;
import model.PladsType;
import storage.Storage;

import java.time.LocalDate;

public class Controller {

    /**
     * Skaber en ny forestilling.<br />
     * @param navn for forestilling
     * @param startDato for forestillings begyndelse
     * @param slutDato for forestillings ophør
     */
    public static Forestilling createForestilling(String navn, LocalDate startDato, LocalDate slutDato) {
        Forestilling forestilling = new Forestilling(navn, startDato, slutDato);
        Storage.addForestilling(forestilling);
        return forestilling;
    }

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
}
