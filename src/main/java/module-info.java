module com.example.javagame {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.almasb.fxgl.all;

    opens com.example.javagame to javafx.fxml;
    exports com.example.javagame;
}