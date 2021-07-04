package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class Enter {
    @FXML
    Button button;
    @FXML
    Label alias;
    @FXML
    Label number;
    @FXML
    ImageView picture;

    public void transmission(ActionEvent actionEvent) throws Exception {
        Main main = new Main();
        main.changeScene("transmission.fxml");
        Main.out.writeUTF("transmission");
    }

    public void payment(ActionEvent actionEvent) throws Exception {
        Main main = new Main();
        main.changeScene("payment.fxml");
        Main.out.writeUTF("payment");
    }

    public void loan(ActionEvent actionEvent) {
    }

    public void logOut(ActionEvent actionEvent) throws Exception {
        Main main = new Main();
        main.changeScene("logOut.fxml");
        Main.out.writeUTF("logOut");
    }

    public void personal(ActionEvent actionEvent) throws Exception {
        Main main = new Main();
        main.changeScene("personalInfo.fxml");
        Main.out.writeUTF("information");
    }

    public void acc(ActionEvent actionEvent) throws Exception {
        Main main = new Main();
        main.changeScene("createAcc.fxml");
        Main.out.writeUTF("createAccount");
    }

    public void button() throws IOException {
        //Image image = new Image("D:\\Bank\\src\\sample\\account.png");
        //picture.setImage(image);
        int i = 0;
        while (i < 2)
        {
            if(i == 0)
                alias.setText(Main.in.readUTF().toString());
            else if(i == 1)
                number.setText(Main.in.readUTF().toString());
            i++;
        }
        button.setDisable(true);
    }

   /* @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Image image = new Image("D:\\Bank\\src\\sample\\account.png");
        //picture.setImage(image);
        int i = 0;
        while (i < 2)
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
                    number.setText(Main.in.readUTF().toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            i++;
        }
    } */
}
