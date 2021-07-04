package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.File;
import java.io.IOException;

public class Payment {
    @FXML
    TextField bill;
    @FXML
    Button pay;
    @FXML
    ImageView view;
    @FXML
    Label money;
    @FXML
    Label label;
    @FXML
    Label amount;

    static String bills;

    public void search(ActionEvent actionEvent) throws Exception {
        bills = bill.getText().toString();
        if (bills.isEmpty()){
            label.setText("Empty field!");
           // Main.out.writeBoolean(false);
        }
        else {
            money.setVisible(true);
           // money.setText("");
            amount.setVisible(true);
            pay.setVisible(true);
            if (Main.in.readUTF().equals("ab"))
                view.setImage(new Image(new File("D:\\Bank\\src\\sample\\ab.png").toURI().toString()));
            else if (Main.in.readUTF().equals("gaz"))
                view.setImage(new Image(new File("D:\\Bank\\src\\sample\\gaz.png").toURI().toString()));
            else if (Main.in.readUTF().equals("bargh"))
                view.setImage(new Image(new File("D:\\Bank\\src\\sample\\bargh.png").toURI().toString()));
            else if (Main.in.readUTF().equals("mokhaberat"))
                view.setImage(new Image(new File("D:\\Bank\\src\\sample\\mokhaberat.png").toURI().toString()));
        }
    }

    public void pay(ActionEvent actionEvent) throws Exception {
        //تو فایل از حساب کم بشه
        Main main = new Main();
        main.changeScene("enter.fxml");
        Main.out.writeUTF("pay");
    }

    public void back(ActionEvent actionEvent) throws Exception {
        Main main = new Main();
        main.changeScene("enter.fxml");
        Main.out.writeUTF("back");
    }
}
