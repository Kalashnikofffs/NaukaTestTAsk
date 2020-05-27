package Services;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import javax.swing.*;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class MyApp extends javafx.application.Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        String fxmlFile = "/sample.fxml";
        FXMLLoader loader = new FXMLLoader();
        Pane root = FXMLLoader.load(getClass().getResource(fxmlFile));
        stage.setMaxWidth(1700);
        stage.setMaxHeight(800);
        stage.setMaximized(true);
        stage.setAlwaysOnTop(false);
        stage.setTitle("Наука");
        stage.setScene(new Scene(root));



        stage.show();
    }
}
