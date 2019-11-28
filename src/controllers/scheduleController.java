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
import modul.Schedule;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;
import java.util.ResourceBundle;

public class scheduleController implements Initializable {

    @FXML
    private TableView<Schedule> table;

    @FXML
    private TableColumn<Schedule,Integer> col_idS;

    @FXML
    private TableColumn<Schedule,Integer> col_idM;

    @FXML
    private TableColumn<Schedule,Integer> col_idR;

    @FXML
    private TableColumn<Schedule, Time> col_startTime;

    @FXML
    private TableColumn<Schedule, Date> col_dateS;

    ObservableList<Schedule> oblist = FXCollections.observableArrayList();

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
            ResultSet rs = con.createStatement().executeQuery("select * from schedule_");

            while (rs.next()){
                oblist.add(new Schedule(rs.getInt("idS"),rs.getInt("idM"),rs.getInt("idR"),rs.getTime("startTime"),rs.getDate("dateS")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        col_idS.setCellValueFactory(new PropertyValueFactory<>("idS"));
        col_idM.setCellValueFactory(new PropertyValueFactory<>("idM"));
        col_idR.setCellValueFactory(new PropertyValueFactory<>("idR"));
        col_startTime.setCellValueFactory(new PropertyValueFactory<>("startTime"));
        col_dateS.setCellValueFactory(new PropertyValueFactory<>("dateS"));


        table.setItems(oblist);
    }
}
