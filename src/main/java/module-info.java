module io.codecanna.jokegeneratorjavafx {
  requires javafx.controls;
  requires javafx.fxml;

  requires org.kordamp.bootstrapfx.core;

  requires java.net.http;

  opens io.codecanna.jokegeneratorjavafx to javafx.fxml;
  exports io.codecanna.jokegeneratorjavafx;
}