package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class Transmission {
    @FXML
    Button search;
    @FXML
    Button transmit;
    @FXML
    Label ba;
    @FXML
    Label an;
    @FXML
    Label al;
    @FXML
    Label balanceAfter;
    @FXML
    Label number;
    @FXML
    Label alias;
    @FXML
    Label label;
    @FXML
    TextField destination;
    @FXML
    TextField amount;

    static String destinations, amounts;

    public void search(ActionEvent actionEvent) {
        destinations = destination.getText().toString();
        amounts = amount.getText().toString();
        if (destinations.equals(""))
            label.setText("Empty field!");
        else if (amounts.equals(""))
            label.setText("Empty field!");
        else {
            ba.setText("balance after transmission:");
            an.setText("account's number:");
            al.setText("alias:");
            //balanceAfter.setText();
            //number.setText();
            //alias.setText();
            transmit.setVisible(true);
        }
    }

    public void transmit(ActionEvent actionEvent) throws Exception {
        Main main = new Main();
        main.changeScene("enter.fxml");
    }
}
