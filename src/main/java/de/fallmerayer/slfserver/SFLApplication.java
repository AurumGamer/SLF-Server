package de.fallmerayer.slfserver;

import de.fallmerayer.slfserver.Manager.StageManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SFLApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(SFLApplication.class.getResource("Controller/start-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Stadt Land Fluss Host Client");
        stage.setScene(scene);
        stage.show();
        stage = StageManager.stage;

    }
}
