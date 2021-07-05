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
    static int clicked = 0;
    public void logOut(ActionEvent actionEvent) throws Exception {
        Main.out.writeUTF("logOut");
        Main main = new Main();
        main.changeScene("signUpOrIn.fxml");
    }
    public void delete(ActionEvent actionEvent) throws Exception {
        Main.out.writeUTF("delete");
        clicked = 0;
        if (check == 0)
        {
            label.setText("Please accept the transmission!");
            Main.out.writeBoolean(false);
        }
        else if (passwords.equals(""))
        {
            label.setText("Empty field!");
            Main.out.writeBoolean(false);
        }
        else if (destinations.equals(""))
        {
            label.setText("Empty field!");
            Main.out.writeBoolean(false);
        }
        else
        {
            Main.out.writeBoolean(true);
            Main.out.writeUTF(passwords);
            Main.out.writeUTF(destinations);
            if(Main.in.readBoolean())
            {
                if(Main.in.readBoolean())
                {
                    Main main = new Main();
                    main.changeScene("signUpOrIn.fxml");
                }
                else
                    label.setText("Invalid destination number!");
            }
            else
                label.setText("Incorrect password!");
        }
    }
    public void check(ActionEvent actionEvent) {
        clicked++;
        if (clicked % 2 == 1) {
            passwords = password.getText().toString();
            destinations = destination.getText().toString();
            check = 1;
        } else
            check = 0;
    }
    public void back(ActionEvent actionEvent) throws Exception {
        Main.out.writeUTF("back");
        Main main = new Main();
        main.changeScene("enter.fxml");
    }
}
