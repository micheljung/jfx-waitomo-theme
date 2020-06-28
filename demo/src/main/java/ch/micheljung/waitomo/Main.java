package ch.micheljung.waitomo;

import ch.micheljung.jfxwaitomo.WaitomoTheme;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    DemoApplication.launch(DemoApplication.class, args);
  }

  public static class DemoApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
      Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/components.fxml")));
      WaitomoTheme.apply(scene);

      primaryStage.setScene(scene);
      primaryStage.show();
    }
  }
}
