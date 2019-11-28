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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Order3Controller implements Initializable {
/*
аль танхим гэдгийг обьектоосоо авна. Одоохондоо хувьсагч авав.
*/
    int screen;
    Image seatAvailable = new Image(String.valueOf(getClass().getResource("/images/seat1.jpg")));
    Image seatTaken = new Image(String.valueOf(getClass().getResource("/images/seat2.jpg")));
    Image seatChosen = new Image(String.valueOf(getClass().getResource("/images/seat3.jpg")));

    @FXML
    private Label lblMovieCharacters11;

    @FXML
    private Label lblMovieDirector11;

    @FXML
    private Button btnBack;

    @FXML
    private Label lblMovieDuration11;

    @FXML
    private Button btnContinue;

    @FXML
    private Label lblMovieName11;

    @FXML
    private Label lblMovieGenre11;

    @FXML
    private GridPane gridPanaAllSeats;

    @FXML
    private Label lblDescription11;

    @FXML
    private ImageView imgMoviePoster11;

    @FXML
    void clickBtnBack(ActionEvent event) {

    }
    @FXML
    void clickBtnContinue(ActionEvent event) {

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        createSeats();
    }

    public void createSeats(){
        int row = 10, column = 20, i,j;
        for(i=0; i<row; i++){
            for (j=0; j<column; j++) {
                Button seat = new Button("");
                seat.setOnAction((ActionEvent e) -> {
                    seat.setStyle("-fx-background-color: blue;");
                });
                gridPanaAllSeats.add(seat, j, i);
            }
            Label lblRow = new Label((i+1) + " row");
            gridPanaAllSeats.add(lblRow, j, i);
        }
    }

    public void back(ActionEvent actionEvent) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("../views/order2.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    public void changeScreen(ActionEvent actionEvent) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("../views/order4.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }
}
