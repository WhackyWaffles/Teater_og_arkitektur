package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Forestilling {
    private String navn;
    private LocalDate startDato;
    private LocalDate slutDato;
    private ArrayList<Bestilling> bestillinger = new ArrayList<>();

    public Forestilling(String navn, LocalDate startDato, LocalDate slutDato) {
        this.navn = navn;
        this.startDato = startDato;
        this.slutDato = slutDato;
    }

    public String getNavn() {
        return navn;
    }

    public LocalDate getStartDato() {
        return startDato;
    }

    public LocalDate getSlutDato() {
        return slutDato;
    }


    // Forestilling har komposition med Bestilling

    public ArrayList<Bestilling> getBestillinger() {

        return bestillinger;
    }
    @Override
    public String toString() {
        return navn + "(" + startDato + " : " + slutDato + ")";
    }

    public boolean erPladsLedig(int række, int nr, LocalDate dato) {
        boolean erPladsLedig = false;
        for (Bestilling bestilling : bestillinger) {
            if(dato==bestilling.getDato()) {
                for (int i = 0; i < bestilling.getPladser().size(); i++) {
                    if(række == bestilling.getPladser().get(i).getRaekke()) {
                        if(nr == bestilling.getPladser().get(i).getNr()) {
                            break;
                        } else {
                            erPladsLedig = true;
                        }
                    }
                }
            }

        }
        return erPladsLedig;
    }

}
