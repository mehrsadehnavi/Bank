package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Loan implements Initializable {
    @FXML
    TextField amount;
    @FXML
    Label baf;
    @FXML
    Label balance;
    @FXML
    Button calculate;
    @FXML
    Button done;
    @FXML
    ChoiceBox payBack;
    @FXML
    Label label;

    String amounts, payBacks;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        payBack.getItems().add("one month");
        payBack.getItems().add("three month");
        payBack.getItems().add("six month");
        payBack.getItems().add("one year");
    }

    public void calculate(ActionEvent actionEvent) throws IOException {
        amounts = amount.getText().toString();
        payBacks = payBack.getValue().toString();


        if (payBacks == null)
            label.setText("Please select a pay back period!");
        else {
            if (amounts.isEmpty())
                label.setText("Empty field!");
            else {
                Main.out.writeUTF(amounts);
                Main.out.writeUTF(payBacks);
                balance.setText("Balance after loan:");
                //baf.setText();
                done.setVisible(true);
                calculate.setVisible(false);
            }
        }
    }

    public void done(ActionEvent actionEvent) throws Exception {
        Main main = new Main();
        main.changeScene("enter.fxml");
    }

    public void back(ActionEvent actionEvent) throws Exception {
        Main main = new Main();
        main.changeScene("enter.fxml");
        Main.out.writeUTF("back");
    }
}
