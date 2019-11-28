package controllers;

import db.DBConnector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import modul.Movie;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;
import java.util.ResourceBundle;

public class movieController implements Initializable {

    @FXML
    private TableView<Movie> table;

    @FXML
    private TableColumn<Movie,Integer> col_idM;

    @FXML
    private TableColumn<Movie,String> col_title;

    @FXML
    private TableColumn<Movie, Time> col_duration;

    @FXML
    private TableColumn<Movie,String> col_description;

    @FXML
    private TableColumn<Movie, Date> col_publishdeDate;

    @FXML
    private TableColumn<Movie,String> col_pngRoot;

    @FXML
    private TableColumn<Movie,String> col_videoRoot;

    @FXML
    private TableColumn<Movie,String> col_actors;

    ObservableList<Movie> oblist = FXCollections.observableArrayList();


    public void back(ActionEvent actionEvent) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("../views/homeAdmin.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            Connection con = DBConnector.getConnection();
            ResultSet rs = con.createStatement().executeQuery("select * from movie");

            while (rs.next()){
                oblist.add(new Movie(rs.getInt("idM"),rs.getString("title"),rs.getTime("duration"),rs.getString("description"),rs.getDate("publishdeDate"),rs.getString("pngRoot"),rs.getString("videoRoot"),rs.getString("actors")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        col_idM.setCellValueFactory(new PropertyValueFactory<>("idM"));
        col_title.setCellValueFactory(new PropertyValueFactory<>("title"));
        col_duration.setCellValueFactory(new PropertyValueFactory<>("duration"));
        col_description.setCellValueFactory(new PropertyValueFactory<>("description"));
        col_publishdeDate.setCellValueFactory(new PropertyValueFactory<>("publishdeDate"));
        col_pngRoot.setCellValueFactory(new PropertyValueFactory<>("pngRoot"));
        col_videoRoot.setCellValueFactory(new PropertyValueFactory<>("videoRoot"));
        col_actors.setCellValueFactory(new PropertyValueFactory<>("actors"));

        table.setItems(oblist);
    }

    public void addMovie(ActionEvent actionEvent) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("../views/addNewMovie.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }
}
