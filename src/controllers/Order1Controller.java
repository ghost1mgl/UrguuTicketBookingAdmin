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
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Order1Controller implements Initializable {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnContinue;

    @FXML
    private Label lblMovieCharacters;

    @FXML
    private Label lblDescription;

    @FXML
    private Label lblMovieDirector;

    @FXML
    private ImageView imgMoviePoster;

    @FXML
    private Label lblDate1;

    @FXML
    private Label lblDate3;

    @FXML
    private Label lblMovieName;

    @FXML
    private Label lblDate2;

    @FXML
    private Label lblMovieGenre;

    @FXML
    private Label lblMovieDuration;

    @FXML
    private ListView<String> listShow1;

    @FXML
    private ListView<String> listShow2;

    @FXML
    private ListView<String> listShow3;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setListShow1();
        setListShow2();
        setListShow3();

    }
/*өнөөдрийн үзвэрийн цагийн хуваарийг list-д харуулах*/
    public void setListShow1(){
        //ugugdliin sangaas tuhain udriin, tuhain kinonii uzveriin huvaariig avna. testiin baidlaar ugugdul onoov.
        ObservableList<String> items = FXCollections.observableArrayList("09:00", "11:00", "13:00", "15:00", "17:00", "19:00", "21:00");
        listShow1.setItems(items);
    }
/*маргаашийн үзвэрийн цагийн хуваарийг list-д харуулах*/
    public void setListShow2(){
        //ugugdliin sangaas tuhain udriin, tuhain kinonii uzveriin huvaariig avna. testiin baidlaar ugugdul onoov.
        ObservableList<String> items = FXCollections.observableArrayList("09:00", "11:00", "13:00", "15:00", "17:00", "19:00", "21:00");
        listShow2.setItems(items);
    }
/*нөгөөдрийн үзвэрийн цагийн хуваарийг list-д харуулах*/
    public void setListShow3(){
        //ugugdliin sangaas tuhain udriin, tuhain kinonii uzveriin huvaariig avna. testiin baidlaar ugugdul onoov.
        ObservableList<String> items = FXCollections.observableArrayList("09:00", "11:00", "13:00", "15:00", "17:00", "19:00", "21:00");
        listShow3.setItems(items);
    }

    public void back(ActionEvent actionEvent) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("../views/home.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    public void changeScreen(ActionEvent actionEvent) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("../views/order2.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }
}
