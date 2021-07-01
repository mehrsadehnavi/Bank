package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.DataInputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Main extends Application {
    private static Stage stage;
    static Socket socket;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        primaryStage.setResizable(false);
        Parent root = FXMLLoader.load(getClass().getResource("signUpOrIn.fxml"));

        socket = new Socket();

        primaryStage.setScene(new Scene(root, 500, 600));
        primaryStage.show();
    }

    public void changeScene(String fxml) throws Exception {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stage.getScene().setRoot(pane);
        //System.out.println(AfterSignInButton.nationals);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
