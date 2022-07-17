package com.lucaswarwick02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class App extends Application
{
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Unofficial Warframe World State (" + WorldState.INSTANCE.worldData.time + ")");
        stage.setWidth(1920);
        stage.setHeight(1080);
        stage.setMaximized(true);

        FXMLLoader loader = new FXMLLoader(App.class.getResource("root.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }

    public static void main( String[] args )
    {
        WorldState.INSTANCE = new WorldState();

        launch();
    }
}
