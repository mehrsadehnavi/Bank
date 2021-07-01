package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LogIn {
    @FXML
    TextField alias;
    @FXML
    PasswordField password;
    @FXML
    Button continueButton;
    @FXML
    Label label;

    static String aliass, passwords;

    public void continueButton(ActionEvent actionEvent) throws Exception {
        aliass = alias.getText().toString();
        passwords = password.getText().toString();
        if (aliass.equals(""))
            label.setText("Empty field!");
        else if (passwords.equals(""))
            label.setText("Empty field!");
        else {
            Main main = new Main();
            main.changeScene("enter.fxml");
        }
    }
}