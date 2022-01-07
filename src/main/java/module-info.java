module com.example.level2lesson6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.level2lesson6 to javafx.fxml;
    exports com.example.level2lesson6;
}