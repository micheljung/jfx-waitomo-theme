package ch.micheljung.waitomo;

import ch.micheljung.jfxwaitomo.WaitomoTheme;
import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;

import java.net.URI;
import java.nio.file.ClosedWatchServiceException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;

public class ComponentsController {
  public Pane root;
  public TableView<Item> table;
  public TableColumn<Item, String> idColumn;
  public TableColumn<Item, String> nameColumn;

  public void initialize() throws Exception {
    table.getItems().setAll(
      new Item("1", "John Doe"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster"),
      new Item("2", "Max Muster")
    );
    idColumn.setCellValueFactory(param -> param.getValue().id);
    nameColumn.setCellValueFactory(param -> param.getValue().name);

    watchFile(Paths.get(WaitomoTheme.WAITOMO_CSS.toURI()));
  }

  private boolean loadStyleSheet(URI uri) {
    return root.getScene().getStylesheets().setAll(uri.toString());
  }

  private void watchFile(Path file) throws Exception {
    WatchService watchService = file.getFileSystem().newWatchService();
    Thread watchThread = new Thread(() -> {
      try {
        while (!Thread.interrupted()) {
          WatchKey key = watchService.take();
          for (WatchEvent<?> watchEvent : key.pollEvents()) {
            Path path = (Path) watchEvent.context();
            if (file.getFileName().equals(path)) {
              Platform.runLater(() -> loadStyleSheet(file.toUri()));
            }
          }
          key.reset();
        }
      } catch (InterruptedException | ClosedWatchServiceException e) {
        // Terminated
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    });
    watchThread.setDaemon(true);
    watchThread.start();

    file.getParent().register(watchService, ENTRY_CREATE, ENTRY_MODIFY);
  }

  private static class Item {
    private final StringProperty id;
    private final StringProperty name;

    public Item(String id, String name) {
      this.id = new SimpleStringProperty(id);
      this.name = new SimpleStringProperty(name);
    }
  }
}
