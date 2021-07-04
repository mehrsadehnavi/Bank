package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class PersonalInfo {
    @FXML
    Button button;
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

    public void button() throws IOException {

        int i = 0;
        while (i < 4)
        {
            if(i == 0)
                name.setText(Main.in.readUTF().toString());
            else if(i == 1)
                national.setText(Main.in.readUTF().toString());
            else if(i == 2)
                telephone.setText(Main.in.readUTF().toString());
            else if(i == 3)
                email.setText(Main.in.readUTF().toString());
            i++;
        }
        i = 0;
        while (i < 4)
        {
            if(i == 0)
                alias.setText(Main.in.readUTF().toString());
            else if(i == 1)
                accNo.setText(Main.in.readUTF().toString());
            else if(i == 2)
                kind.setText(Main.in.readUTF().toString());
            else if(i == 3)
                balance.setText(Main.in.readUTF().toString());
            i++;
        }
        button.setDisable(true);
    }

    public void done(ActionEvent actionEvent) throws Exception {
        Main main = new Main();
        main.changeScene("enter.fxml");
    }

    public void back(ActionEvent actionEvent) throws Exception {
        Main main = new Main();
        main.changeScene("enter.fxml");
        //Main.out.writeUTF("back");
    }

    /* @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        transaction.setEditable(false);

        int i = 0;
        while (i < 4)
        {
            if(i == 0) {
                try {
                    name.setText(Main.in.readUTF().toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if(i == 1) {
                try {
                    national.setText(Main.in.readUTF().toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if(i == 2) {
                try {
                    telephone.setText(Main.in.readUTF().toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if(i == 3) {
                try {
                    email.setText(Main.in.readUTF().toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            i++;
        }
        i = 0;
        while (i < 4)
        {
            if(i == 0) {
                try {
                    alias.setText(Main.in.readUTF().toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if(i == 1) {
                try {
                    accNo.setText(Main.in.readUTF().toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if(i == 2) {
                try {
                    kind.setText(Main.in.readUTF().toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if(i == 3) {
                try {
                    balance.setText(Main.in.readUTF().toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            i++;
        }
    } */
}
