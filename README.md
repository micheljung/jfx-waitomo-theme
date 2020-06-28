# JFX Waitomo Theme

![Bintray](https://img.shields.io/bintray/v/micheljung/maven/jfx-waitomo-theme)
[![GitHub issues](https://img.shields.io/github/issues/micheljung/jfx-waitomo-theme)](https://github.com/micheljung/jfx-waitomo-theme/issues)
[![GitHub forks](https://img.shields.io/github/forks/micheljung/jfx-waitomo-theme)](https://github.com/micheljung/jfx-waitomo-theme/network)
[![GitHub stars](https://img.shields.io/github/stars/micheljung/jfx-waitomo-theme)](https://github.com/micheljung/jfx-waitomo-theme/stargazers)


![Screenshot](media/screenshot.png)

## How to use:

```java
public class Main {
  public static void main(String[] args) {
    DemoApplication.launch(DemoApplication.class, args);
  }

  public static class DemoApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
      Scene scene = new Scene(new StackPane());
      WaitomoTheme.apply(scene);

      primaryStage.setScene(scene);
      primaryStage.show();
    }
  }
}
```

## Get It Now

Get it via https://bintray.com/micheljung/maven/jfx-waimoto-theme/

```
implementation 'ch.micheljung.waitomo:jfx-waitomo-theme:0.1.0'
```

## Important

Not all components have been styled yet.
