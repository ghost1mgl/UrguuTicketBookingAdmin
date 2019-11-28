package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Order4Controller implements Initializable {
    @FXML
    private Label lblNumChild;

    @FXML
    private Button btnBack;

    @FXML
    private Label lblChildAmount;

    @FXML
    private Label lblNumAdult;

    @FXML
    private TextField tfPhone;

    @FXML
    private Label lblDate;

    @FXML
    private TextField tfEmail;

    @FXML
    private Label lblNumTicket;

    @FXML
    private Label lblTotal;

    @FXML
    private Label lblMovieName;

    @FXML
    private Label lblAdultAmount;

    @FXML
    private Button btnBuy;

    @FXML
    private Label lblTotal1;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


    public void back(ActionEvent actionEvent) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("../views/order3.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    public void finish(ActionEvent actionEvent) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("../views/home.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }
}
