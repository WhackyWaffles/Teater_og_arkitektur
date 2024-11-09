package gui;

import controller.Controller;
import model.Forestilling;
import model.Kunde;

import java.time.LocalDate;


public class App {
    public static void main(String[] args) {
        initStorage();
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
    }
}

