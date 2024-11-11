package gui;

import controller.Controller;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import model.Forestilling;
import model.Kunde;

import java.time.LocalDate;
import java.util.ArrayList;

public class TeaterVindue extends Application {

    private final ListView<Forestilling> forestillingListView = new ListView<>();
    private final ListView<Kunde> kundeListView = new ListView<>();
    private final TextField navneTextField = new TextField();
    private final TextField startDatoTextField = new TextField();
    private final TextField slutDatoTextField = new TextField();
    private final TextField kundeNavnTextField = new TextField();
    private final TextField kundeMobilTextField = new TextField();

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Teater system");
        GridPane pane = new GridPane();
        initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setGridLinesVisible(false);

        Label lblForestillinger = new Label("Forestillinger");
        pane.add(lblForestillinger, 0, 0);
        Label lblKunder = new Label("Kunder");
        pane.add(lblKunder, 2, 0);

        pane.add(forestillingListView, 0, 1, 2, 1);
        forestillingListView.setPrefSize(200, 200);
        forestillingListView.getItems().setAll(Controller.getForestillinger());

        pane.add(kundeListView, 2, 1, 2, 1);
        kundeListView.setPrefSize(200, 200);
        kundeListView.getItems().setAll(Controller.getKunder());

        Label lblNavn = new Label("Navn");
        pane.add(lblNavn, 0, 2);
        pane.add(navneTextField, 1, 2);

        Label lblStartDato = new Label("Start dato");
        pane.add(lblStartDato, 0, 3);
        pane.add(startDatoTextField, 1, 3);

        Label lblSlutDato = new Label("Slut dato");
        pane.add(lblSlutDato, 0, 4);
        pane.add(slutDatoTextField, 1, 4);

        Label lblKundeNavn = new Label("Kunde navn");
        pane.add(lblKundeNavn, 2, 2);
        pane.add(kundeNavnTextField, 3, 2);

        Label lblKundeMobil = new Label("Kunde mobil");
        pane.add(lblKundeMobil, 2, 3);
        pane.add(kundeMobilTextField, 3, 3);

        Button btnAddForestilling = new Button("Opret forestilling");
        pane.add(btnAddForestilling, 1, 5);
        btnAddForestilling.setOnAction(event -> addForestillingAction());

        Button btnAddKunde = new Button("Opret kunde");
        pane.add(btnAddKunde, 3, 5);
        btnAddKunde.setOnAction(event -> addKundeAction());
    }

//-------------------------------------------------------------------------------
    // Knapfunktioner

    private void addForestillingAction() {
        LocalDate startDato = LocalDate.parse(startDatoTextField.getText().trim());
        LocalDate slutDato = LocalDate.parse(slutDatoTextField.getText().trim());

        if (navneTextField.getLength() > 0 && startDatoTextField.getLength() > 0 && slutDatoTextField.getLength() > 0) {
            Forestilling forestilling = new Forestilling(navneTextField.getText().trim(), startDato, slutDato);
            forestillingListView.getItems().add(forestilling);

            navneTextField.clear();
            startDatoTextField.clear();
            slutDatoTextField.clear();
        }
    }

    private void addKundeAction() {
        if (!kundeNavnTextField.getText().isEmpty() && !kundeMobilTextField.getText().isEmpty()) {
            Kunde kunde = Controller.createKunde(kundeNavnTextField.getText(), kundeMobilTextField.getText());
            kundeListView.getItems().add(kunde);
        }
        kundeNavnTextField.clear();
        kundeMobilTextField.clear();
    }
}


