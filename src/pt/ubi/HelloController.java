package pt.ubi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Stage stage;
   
    public void begin_(ActionEvent e) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("../resources/player1_J.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load());
        playerControllers controller = fxmlLoader.getController();
        controller.setVisible(false);
        stage.setTitle("Battleship p1");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

}

