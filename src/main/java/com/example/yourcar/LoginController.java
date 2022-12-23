package com.example.yourcar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;
import java.nio.Buffer;

public class LoginController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField email;
    @FXML
    private PasswordField password;
    @FXML
    private Label label;


    public void Login(ActionEvent event) throws IOException {


        FileReader fr = new FileReader("E:\\SEMESTER 3\\JAVA FX\\YOURCAR\\src\\main\\java\\com\\example\\yourcar\\ID.txt");
        FileReader fr1 = new FileReader("E:\\SEMESTER 3\\JAVA FX\\YOURCAR\\src\\main\\java\\com\\example\\yourcar\\PASSWORD.txt");

        BufferedReader br = new BufferedReader(fr);
        BufferedReader br1 = new BufferedReader(fr1);

        String em = email.getText();
        String pass = password.getText();


        String checkU = br.readLine();
        String checkP = br1.readLine();

        fr.close();
        fr1.close();

        br.close();
        br1.close();

            if (em.equals(checkU) && pass.equals(checkP)) {
                switchToScene5(event);
            }
            else {
                label.setText("Wrong Email or Password");
            }
       }

    public void Signup(ActionEvent event) throws IOException {
        switchToScene2(event);
    }


    public void switchToScene5(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scene5.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}




