package lk.ijse.dep11.app.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class OtherLoginController {
    public AnchorPane root;
    public Button btnSignIn;
    public Button btnSignUp;
    public TextField txtName;
    public TextField txtPassword;

    public void btnSignInOnAction(ActionEvent actionEvent) {
    }

    public void btnSignUpOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/EmployeeRegistrationForm.fxml"))));
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(root.getScene().getWindow());
        stage.setTitle("Employee Registration");
        stage.setResizable(false);
        stage.show();
        stage.centerOnScreen();

    }
}
