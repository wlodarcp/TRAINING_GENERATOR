package GUI;

import GUI.Controllers.Controller;
import GUI.Controllers.StartWiewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main extends Application {
    public StartWiewController StartWiewController;
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        StartWiewController = (StartWiewController)load("../sourceFiles/startWiew.fxml");
        StartWiewController.showLogOrRegistration();
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.setResizable(false);
        primaryStage.setTitle("SMYK8000");
        primaryStage.show();
    }

    public void show(final Scene scene) {
        primaryStage.setScene(scene);
    }

    public Controller load(final String name) throws IOException {
        final FXMLLoader loader = new FXMLLoader(getClass().getResource(name));
        loader.load();
        final Controller controller = loader.getController();
        controller.configure(this, new Scene(loader.getRoot()));
        return controller;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
