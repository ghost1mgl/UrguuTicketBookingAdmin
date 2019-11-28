package controllers;

import db.DBConnector;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Date;
import java.util.ResourceBundle;

public class addNewMovieController implements Initializable {

    @FXML
    private TextField txt_idM;

    @FXML
    private TextField txt_actors;

    @FXML
    private TextField txt_title;

    @FXML
    private TextField txt_duration;

    @FXML
    private TextField txt_description;

    @FXML
    private TextField txt_publishdeDate;

    @FXML
    private TextField txt_pngRoot;

    @FXML
    private TextField txt_videoRoot;

    @FXML
    private TextField txt_movieType;

    @FXML
    private TextField txt_movieGPA;

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

    public void addMovie(ActionEvent actionEvent) throws IOException, SQLException {
        addToDB();
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("../views/movie.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    public void addToDB() throws SQLException {
        String query = " insert into movie (idM, title, duration, description, publishdeDate, pngRoot, videoRoot, actors, movieType, movieGPA)"
                + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        Connection con = DBConnector.getConnection();

        Integer idM;
        Time duration;
        Date publishdeDate;
        String title,description,pngRoot,videoRoot,actors,movieType,movieGPA;

        idM = Integer.valueOf(txt_idM.getText().toString());
        duration = Time.valueOf(txt_duration.getText().toString());
        publishdeDate = Date.valueOf(txt_publishdeDate.getText().toString());
        title = txt_title.getText().toString();
        description = txt_description.getText().toString();
        pngRoot = txt_pngRoot.getText().toString();
        videoRoot = txt_videoRoot.getText().toString();
        actors = txt_actors.getText().toString();
        movieType = txt_movieType.getText().toString();
        movieGPA = txt_movieGPA.getText().toString();

        PreparedStatement preparedStmt = con.prepareStatement(query);
        preparedStmt.setInt (1, idM);
        preparedStmt.setString(2, title);
        preparedStmt.setTime  (3, duration);
        preparedStmt.setString(4, description);
        preparedStmt.setDate  (5, publishdeDate);
        preparedStmt.setString(6, pngRoot);
        preparedStmt.setString(7, videoRoot);
        preparedStmt.setString(8, actors);
        preparedStmt.setString(9, movieType);
        preparedStmt.setString(10, movieGPA);

        preparedStmt.execute();
    }

}
