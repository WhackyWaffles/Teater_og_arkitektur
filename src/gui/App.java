package gui;

import controller.Controller;
import model.Forestilling;
import model.Kunde;
import model.PladsType;

import java.time.LocalDate;


public class App {
    public static void main(String[] args) {
        initStorage();
        Application.launch(BestillingsVindue.class);
    }

    /**
     * Starter storage med nogle objekter
     */
    public static void initStorage() {
        Forestilling evita = Controller.createForestilling("Evita", LocalDate.of(2023, 8, 10), LocalDate.of(2023, 8, 20));
        Forestilling lykkeper = Controller.createForestilling("Lykke Per", LocalDate.of(2023, 9, 1), LocalDate.of(2023, 9, 10));
        Forestilling chess = Controller.createForestilling("Chess", LocalDate.of(2023, 8, 21), LocalDate.of(2023, 8, 30));

        Kunde anders = Controller.createKunde("Anders Hansen", "11223344");
        Kunde peter = Controller.createKunde("Peter Jensen", "12345678");
        Kunde niels = Controller.createKunde("Niels Madsen", "12341234");

        for (int række = 1; række < 15; række++) {
            for (int plads = 1; plads <= 20; plads++) {
                int pris;
                PladsType pladsType = PladsType.STANDARD;

//                Gul zone
                if (række <= 5 && plads >= 3 && plads <= 18) {
                    pris = 500;
                }
//                Grøn zone øverst venstre
                else if (række <= 5 && plads <= 2) {
                    pris = 450;
                }
//                Grøn zone øverst højre
                else if (række <= 5 && plads >= 19) {
                    pris = 450;
                }
//                Grøn zone midte, til og med række 9
                else if (række >= 6 && række <= 9 && plads >= 3 && plads <= 18) {
                    pris = 450;
                }
//                Grøn zone midte, række 10, til venstre for kørestolspladser
                else if (række == 10 && plads >= 3 && plads <= 7) {
                    pris = 450;
                }
//                Grøn zone midte, række 10, kørestolspladser
                else if (række == 10 && plads >= 8 && plads <= 12) {
                    pris = 450;
                    pladsType = PladsType.KOERESTOL;
                }
//                Grøn zone midte, række 9 til højre for kørestolspladser
                else if (række == 10 && plads >= 13 && plads <= 18) {
                    pris = 450;
                }
//                Blå zone, række 11, ekstra benpladser
                else if (række == 11 && plads >= 8 && plads <= 12) {
                    pris = 400;
                    pladsType = PladsType.EKSTRABEN;
                }
//                Blå zone
                else {
                    pris = 400;
                }
//                Opret pladserne og reset pladstype
                controller.Controller.createPlads(række, plads, pris, pladsType);
                pladsType = PladsType.STANDARD;
            }
        }
    }
}

