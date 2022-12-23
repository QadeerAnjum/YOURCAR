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

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class signupController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField firstname;
    @FXML
    private TextField lastname;
    @FXML
    private TextField country;
    @FXML
    private TextField city;
    @FXML
    private TextField phone;
    @FXML
    private TextField email;
    @FXML
    private PasswordField password;
    @FXML
    private Label label;

    public void Signup(ActionEvent event) throws IOException {

        File fileID = new File("E:\\SEMESTER 3\\JAVA FX\\YOURCAR\\src\\main\\java\\com\\example\\yourcar\\ID.txt");
        File filePASS = new File("E:\\SEMESTER 3\\JAVA FX\\YOURCAR\\src\\main\\java\\com\\example\\yourcar\\PASSWORD.txt");


        FileWriter fw = new FileWriter(fileID, true);
        FileWriter fwp = new FileWriter(filePASS, true);


        String fn = firstname.getText();

        String ln = lastname.getText();

        String co = country.getText();


        String ci = city.getText();


        String ph = phone.getText();


        String em = email.getText();


        String pa = password.getText();

        fw.write(em);
        fwp.write(pa);

        fw.close();
        fwp.close();

        switchToScene1(event);

    }

        public void switchToScene1(ActionEvent event) throws IOException {
            root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }


}
