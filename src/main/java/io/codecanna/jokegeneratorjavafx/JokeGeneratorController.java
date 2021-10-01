package io.codecanna.jokegeneratorjavafx;

import java.io.IOException;
import java.net.URI;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
// HTTP Stuff
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class JokeGeneratorController {

  @FXML
  private Label welcomeText;

  @FXML
  protected void onHelloButtonClick() {
    welcomeText.setText("Welcome to JavaFX Application!");
  }

  @FXML
  protected void onJokeButtonCLick() throws IOException, InterruptedException {
    HttpClient httpClient = HttpClient.newHttpClient();
    HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create("https://icanhazdadjoke.com/")).header("Accept", "text/plain").build();

    HttpResponse<String> httpResponse = httpClient.send(httpRequest, BodyHandlers.ofString());

    welcomeText.setText(httpResponse.body());
  }
}