package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.File;


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
        Main.out.writeUTF("search");
        if (bills.isEmpty()){
            label.setText("Empty field!");
            Main.out.writeBoolean(false);
        }
        else {
            Main.out.writeBoolean(true);
            Main.out.writeUTF(bills);
            if(Main.in.readBoolean())
            {
                money.setVisible(true);
                money.setText(Main.in.readUTF());
                amount.setVisible(true);
                pay.setVisible(true);
                String serverRequest = Main.in.readUTF();
                if (serverRequest.equals("ab"))
                    view.setImage(new Image(new File("C:\\Users\\amirhosein\\IdeaProjects\\Bank\\src\\photos\\ab.png").toURI().toString()));
                else if (serverRequest.equals("gaz"))
                    view.setImage(new Image(new File("C:\\Users\\amirhosein\\IdeaProjects\\Bank\\src\\photos\\gaz.png").toURI().toString()));
                else if (serverRequest.equals("bargh"))
                    view.setImage(new Image(new File("C:\\Users\\amirhosein\\IdeaProjects\\Bank\\src\\photos\\bargh.png").toURI().toString()));
                else if (serverRequest.equals("mokhaberat"))
                    view.setImage(new Image(new File("C:\\Users\\amirhosein\\IdeaProjects\\Bank\\src\\photos\\mokhaberat.png").toURI().toString()));
            }
            else
                label.setText("Invalid bill number!");
        }
    }

    public void pay(ActionEvent actionEvent) throws Exception {
        Main.out.writeUTF("pay");
        if(Main.in.readBoolean())
        {
            Main main = new Main();
            main.changeScene("enter.fxml");
        }
        else
        {
            label.setText("Insufficient balance!");
            pay.setVisible(false);
        }
    }

    public void back(ActionEvent actionEvent) throws Exception {

        Main main = new Main();
        main.changeScene("enter.fxml");
        Main.out.writeUTF("back");
    }
}