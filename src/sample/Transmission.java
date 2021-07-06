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

import java.io.IOException;

public class Transmission {
    @FXML
    Button search;
    @FXML
    Button transmit;
    @FXML
    Label an;
    @FXML
    Label al;
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

    public void search(ActionEvent actionEvent) throws IOException {
        label.setText("");
        Main.out.writeUTF("search");

        destinations = destination.getText().toString();
        amounts = amount.getText().toString();

        Main.out.writeUTF(destinations);
        Main.out.writeUTF(amounts);

        if (destinations.equals(""))
        {
            label.setText("Empty field!");
            Main.out.writeBoolean(false);
        }
        else if (amounts.equals(""))
        {
            label.setText("Empty field!");
            Main.out.writeBoolean(false);
        }
        else {
            Main.out.writeBoolean(true);
            if(!(Main.in.readBoolean()))
                label.setText("Invalid destination number!");
            else
            {
                transmit.setVisible(true);
                System.out.println(-2);
                search.setVisible(false);
                an.setText("account's username:");
                al.setText("alias:");
                alias.setText(Main.in.readUTF());
                number.setText(Main.in.readUTF());
            }
        }
    }
    public void transmit(ActionEvent actionEvent) throws Exception {
        System.out.println(-1);
        Main.out.writeUTF("transmit");
        if(!(Main.in.readBoolean()))
        {
            System.out.println(0);
            label.setText("Insufficient balance!");
            transmit.setVisible(false);
            number.setText("");
            alias.setText("");
            al.setText("");
            an.setText("");
        }
        else
        {
            Main main = new Main();
            main.changeScene("enter.fxml");
        }
    }
    public void back(ActionEvent actionEvent) throws Exception {
        System.out.println(1);
        Main.out.writeUTF("back");
        Main main = new Main();
        main.changeScene("enter.fxml");
    }
}
