package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class PersonalInfo {
    @FXML
    Label name;
    @FXML
    Label national;
    @FXML
    Label email;
    @FXML
    Label accNo;
    @FXML
    Label telephone;
    @FXML
    Label alias;
    @FXML
    Label kind;
    @FXML
    Label b;
    @FXML
    Label balance;
    @FXML
    TextArea transaction;
    @FXML
    Button done;

    public void button() {
        name.setText(AfterSignUpButton.usernames);
        national.setText(AfterSignUpButton.nationals);
        email.setText(AfterSignUpButton.emails);
        //accNo.setText();
        telephone.setText(AfterSignUpButton.telephones);
        alias.setText(LogIn.aliass);
        kind.setText(CreateAcc.kinds);
    }

    public void show(ActionEvent actionEvent) {
        b.setText("Balance:");
        //balance.setText();
        transaction.setVisible(true);
        transaction.isWrapText();
        done.setVisible(true);
    }

    public void done(ActionEvent actionEvent) throws Exception {
        Main main = new Main();
        main.changeScene("enter.fxml");
    }
}
