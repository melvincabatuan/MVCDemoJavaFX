module com.example.mvcdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.mvcdemo to javafx.fxml;
    exports com.example.mvcdemo;
}