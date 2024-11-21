package com.example.javagame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.shape.Box;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

import java.io.IOException;

public class JavaGame extends Application {
    private GameTimer gameTimer;

    @Override
    public void start(Stage stage) throws IOException {
        Box box = new Box(100, 100, 100);
        box.setTranslateX(250);
        box.setTranslateY(100);
        box.setTranslateZ(400);

        PerspectiveCamera camera = new PerspectiveCamera(false);
        camera.setTranslateX(150);
        camera.setTranslateY(-100);
        camera.setTranslateZ(250);

        Group root = new Group(box);
        root.setRotationAxis(Rotate.X_AXIS);
        root.setRotate(30);

        Scene scene = new Scene(root, 500, 300, true);
        scene.setCamera(camera);
        stage.setScene(scene);
        stage.setTitle("3D Example");

        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.D) {
                camera.setTranslateX(camera.getTranslateX() + 3);
            } else if (event.getCode() == KeyCode.A) {
                camera.setTranslateX(camera.getTranslateX() - 3);
            }
        });

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}