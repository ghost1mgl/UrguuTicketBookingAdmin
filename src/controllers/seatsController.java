package controllers;

import db.DBConnector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import modul.Booking;
import modul.Movie;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class seatsController implements Initializable {

    ObservableList<Booking> oblist = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            Connection con = DBConnector.getConnection();
            ResultSet rs = con.createStatement().executeQuery("select * from movie");

            while (rs.next()){
                oblist.add(new Booking(rs.getInt("idB"),rs.getInt("idS"),rs.getInt("childNumber"),rs.getInt("adultNumber"),rs.getInt("bill"),rs.getString("bookedSeats")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
