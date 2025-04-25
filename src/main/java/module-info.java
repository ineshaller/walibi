module com.example.walibi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.walibi to javafx.fxml;
    exports com.example.walibi;
}