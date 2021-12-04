module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.alproDictionary.fx to javafx.fxml;
    exports com.alproDictionary.fx;
}