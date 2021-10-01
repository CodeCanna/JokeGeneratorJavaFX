package io.codecanna.jokegeneratorjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;



public class JokeGenerator extends Application {

  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(JokeGenerator.class.getResource("hello-view.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 1200, 720);
    stage.setTitle("Joke Generator (JavaFX)");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}