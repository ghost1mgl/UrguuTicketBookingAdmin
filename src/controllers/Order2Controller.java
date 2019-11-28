package controllers;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Order2Controller implements Initializable {

    @FXML
    private Button btnBack;

    @FXML
    private Label lblAvailanleSeats;

    @FXML
    private Button btnContinue;

    @FXML
    private Label lblMovieName11;

    @FXML
    private Label lblDate;

    @FXML
    private ImageView imgMoviePoster11;

    @FXML
    private Label lblMovieGenre111;

    @FXML
    private Label lblMovieCharacters11;

    @FXML
    private Label lblMovieDirector11;

    @FXML
    private Label lblMovieDuration11;

    @FXML
    private Label lblMovieName111;

    @FXML
    private Label lblMovieGenre11;

    @FXML
    private Label lblDescription11;

    @FXML
    private Label lblMovieDuration111;

    @FXML
    private Label lblScreen;

    @FXML
    private ChoiceBox<Integer> chcboxAdult;

    @FXML
    private ChoiceBox<Integer> chcboxChild;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setChoiceboxes();
    }
//ticketnii toog oruulah choicebox-d set hiih
    public void setChoiceboxes(){
        ObservableList<Integer> number = FXCollections.observableArrayList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        chcboxAdult.setItems(number);
        chcboxChild.setItems(number);
        chcboxAdult.getSelectionModel().select(0);
        chcboxChild.getSelectionModel().select(0);
    }


    /*буцах товч дарагдах үед ажиллах функц*/
    public void clickBtnBack(){

    }
    /*үргэлжүүлэх товч дарагдах үед ажиллах функц*/
    public void clickBtnContinuek(){
    }

    public void back(ActionEvent actionEvent) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("../views/order1.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    public void changeScreen(ActionEvent actionEvent) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("../views/order3.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }
}
