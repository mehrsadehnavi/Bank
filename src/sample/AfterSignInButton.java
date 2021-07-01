package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Font;

public class AfterSignInButton {
    @FXML
    PasswordField password;
    @FXML
    TextField national;
    @FXML
    Button continueButton;
    @FXML
    Label label;

    static String nationals, passwords;


    public void continueButton(ActionEvent actionEvent) throws Exception {
        nationals = national.getText().toString();
        passwords = password.getText().toString();

        if (nationals.equals("m") && passwords.equals("m")) {
            Main main = new Main();
            main.changeScene("logIn.fxml");
            nationals = national.getText().toString();
        }

        else if (nationals.equals("") || passwords.equals(""))
            label.setText("Empty field!");

        else
            label.setText("Please make sure the username and password are correct!");
    }
}

