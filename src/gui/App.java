package gui;

import controller.Controller;
import model.Forestilling;
import model.Kunde;
import model.Plads;
import model.PladsType;

import java.time.LocalDate;


public class App {
    public static void main(String[] args) {
        initStorage();
//        Application.launch(BestillingsVindue.class);
        testPrint();
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

        for (int række = 0; række <= 14; række++) {
            for (int nr = 0; nr <= 19; nr++) {
                int pris;
                PladsType pladsType = PladsType.STANDARD;

//                Gul zone
                if (række <= 4 && nr >= 3 && nr <= 17) {
                    pris = 500;
                }
//                Grøn zone øverst venstre
                else if (række <= 4 && nr <= 1) {
                    pris = 450;
                }
//                Grøn zone øverst højre
                else if (række <= 4 && nr >= 18) {
                    pris = 450;
                }
//                Grøn zone midte, til og med række 9
                else if (række >= 5 && række <= 8 && nr >= 2 && nr <= 17) {
                    pris = 450;
                }
//                Grøn zone midte, række 10, til venstre for kørestolspladser
                else if (række == 9 && nr >= 2 && nr <= 6) {
                    pris = 450;
                }
//                Grøn zone midte, række 10, kørestolspladser
                else if (række == 9 && nr >= 7 && nr <= 11) {
                    pris = 450;
                    pladsType = PladsType.KOERESTOL;
                }
//                Grøn zone midte, række 9 til højre for kørestolspladser
                else if (række == 9 && nr >= 12 && nr <= 17) {
                    pris = 450;
                }
//                Blå zone, række 11, ekstra benpladser
                else if (række == 10 && nr >= 7 && nr <= 11) {
                    pris = 400;
                    pladsType = PladsType.EKSTRABEN;
                }
//                Blå zone
                else {
                    pris = 400;
                }
//                Opret pladserne og reset pladstype
                controller.Controller.createPlads(række, nr, pris, pladsType);
                pladsType = PladsType.STANDARD;
            }
        }
    }

    /**
     * Metode for at udskrive alle Forestillinger, Kunder og Pladser
     */
    public static void testPrint() {
        System.out.println("Forestillinger:");
        for (Forestilling forestilling : Controller.getForestillinger()) {
            System.out.println(
                    forestilling.getNavn() +
                    " spiller fra " +
                    forestilling.getStartDato() +
                    " til " +
                    forestilling.getSlutDato());
                    System.out.println();
        }
        System.out.println();
        System.out.println("Registrerede kunder:");
        for (Kunde kunde : Controller.getKunder()) {
            System.out.println(
                    kunde.getNavn() +
                    " (" +
                    kunde.getMobil() +
                    ")");
        }
        System.out.println();
        System.out.println("Pladser i salen (i alt " + Controller.getPladser().size() + "):");
        for (int række = 0; række <= 14; række++) {
            for (int nr = 0; nr <= 19; nr++) {
                if (nr == 19) {
                    System.out.printf("%1$5s", Controller.getPladser().get(nr + 20 * (række)).getNavn());
                } else System.out.printf("%1$8s", Controller.getPladser().get(nr + 20 * (række)).getNavn() + " : ");
            }
            System.out.println();
        }
    }
}

