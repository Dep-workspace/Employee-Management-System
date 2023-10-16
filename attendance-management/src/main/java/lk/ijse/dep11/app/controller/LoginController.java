package lk.ijse.dep11.app.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    public AnchorPane root;

    public void btnAdminOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/AdminLogin.fxml"))));
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(root.getScene().getWindow());
        stage.setTitle("Admin Login");
        stage.setResizable(false);
        stage.show();
        stage.centerOnScreen();
    }

    public void btnITOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ITLogin.fxml"))));
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(root.getScene().getWindow());
        stage.setTitle("IT Login");
        stage.setResizable(false);
        stage.show();
        stage.centerOnScreen();
    }

    public void btnHROnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/HRLogin.fxml"))));
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(root.getScene().getWindow());
        stage.setTitle("HR Login");
        stage.setResizable(false);
        stage.show();
        stage.centerOnScreen();
        
    }

    public void btnOtherOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/OtherLogin.fxml"))));
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(root.getScene().getWindow());
        stage.setTitle("Other Login");
        stage.setResizable(false);
        stage.show();
        stage.centerOnScreen();
    }
}
