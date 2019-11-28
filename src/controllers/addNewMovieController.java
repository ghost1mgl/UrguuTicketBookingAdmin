package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class addNewMovieController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void cancel(ActionEvent actionEvent) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("../views/movie.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    public void addMovie(ActionEvent actionEvent) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("../views/movie.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }
}
