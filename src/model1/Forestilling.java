package model1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Forestilling {
    private String navn;
    private LocalDate startDato;
    private LocalDate slutDato;
    private ArrayList<Bestilling>bestillinger = new ArrayList<>();


    public Forestilling(String navn, LocalDate startDato, LocalDate slutDato, ArrayList<Bestilling> bestillinger1) {
        this.navn = navn;
        this.startDato = startDato;
        this.slutDato = slutDato;
        this.bestillinger = bestillinger1;
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
    //Forestilling har komposition med Bestilling



    public ArrayList<Bestilling> getBestillinger() {
        return new ArrayList<>(bestillinger);
    }
//    public Bestilling createBestilling(LocalDate fraDato) {
//
//    }

}
