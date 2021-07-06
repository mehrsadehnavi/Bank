package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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

    public void loan(ActionEvent actionEvent) throws Exception {
        Main main = new Main();
        main.changeScene("loan.fxml");
        Main.out.writeUTF("loan");
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

    public void button() throws Exception {
        picture.setImage(new Image(new File("D:\\Bank\\src\\sample\\ax.png").toURI().toString()));
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
    public void exit(ActionEvent actionEvent) {
        Main main = new Main();
        main.exit();
    }
}