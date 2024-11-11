package gui;


import controller.Controller;
import model.Forestilling;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        initStorage();
        launch(args);

    }

    public static void initStorage()  {

      //Create several Forestilling objects
        Controller.createForestilling("Evita", LocalDate.of(2023,8,10),LocalDate.of(2023,8,20));
        Controller.createForestilling("Lykke per", LocalDate.of(2023,9,01),LocalDate.of(2023,9,10));
        Controller.createForestilling("Evita", LocalDate.of(2023,8,21),LocalDate.of(2023,8,30));

        //Create several Kunde objects
        Controller.createKunde("Anders Hansen","11223344");
        Controller.createKunde("Peter Jensen", "12345678");
        Controller.createKunde("Niels Madsen", "12341234");

        //Create Plads objects
        //Controller.createPlads(15,20,)


    }
}
