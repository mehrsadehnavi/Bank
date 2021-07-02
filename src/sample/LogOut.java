package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LogOut {
    @FXML
    PasswordField password;
    @FXML
    TextField destination;
    @FXML
    Label label;

    static String passwords, destinations;
    static int check = 0;

    public void logOut(ActionEvent actionEvent) throws Exception {
        Main main = new Main();
        main.changeScene("signUpOrIn.fxml");
    }

    public void delete(ActionEvent actionEvent) throws Exception {
        if (check == 0)
            label.setText("Please accept the transmission!");
        else if (passwords.isEmpty())
            label.setText("Empty field!");
        else if (destinations.isEmpty())
            label.setText("Empty field!");
        else {
            Main main = new Main();
            main.changeScene("signUpOrIn.fxml");
        }
    }
    public void check(ActionEvent actionEvent) {
        passwords = password.getText().toString();
        destinations = destination.getText().toString();
        check = 1;
    }

    public void back(ActionEvent actionEvent) throws Exception {
        Main main = new Main();
        main.changeScene("enter.fxml");
        Main.out.writeUTF("back");
    }
}
