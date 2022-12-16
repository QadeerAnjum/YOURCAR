module com.example.yourcar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.yourcar to javafx.fxml;
    exports com.example.yourcar;
}