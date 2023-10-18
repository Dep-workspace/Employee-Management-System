package lk.ijse.dep11.app.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class EmployeeRegistrationFormController {
    public AnchorPane root;
    public TextField txtName;
    public TextField txtID;
    public TextField txtUserName;
    public PasswordField txtPassword;
    public TextField txtNIC;
    public TextField txtContactNo;
    public TextField txtRole;
    public Button btnAddProfilePicture;
    public ComboBox<String> cmbSelectBranch;
    public ComboBox<String> cmbSelectStatus;
    public Button btnGenerateQR;
    public Button btnSubmit;

    public void btnAddProfilePictureOnAction(ActionEvent actionEvent) {
    }

    public void btnGenerateQROnAction(ActionEvent actionEvent) {
    }

    public void btnSubmitOnAction(ActionEvent actionEvent) {
    }
}
