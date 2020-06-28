package ch.micheljung.waitomo;

import javafx.scene.Scene;

import java.net.URL;

public final class WaitomoTheme {

  public static final URL WAITOMO_CSS = WaitomoTheme.class.getResource("/css/waitomo.css");

  private WaitomoTheme() {
  }

  public static void apply(Scene scene) {
    scene.getStylesheets().add(WAITOMO_CSS.toExternalForm());
  }
}
