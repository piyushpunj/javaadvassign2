import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainScene {

    private ImageView dogImageView;

    public MainScene(Stage primaryStage) {
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 400, 400);
        scene.getStylesheets().add("styles.css"); // Load your CSS file

        dogImageView = new ImageView();
        dogImageView.setId("dogImageView"); // Set ID for styling

        Button callApiButton = new Button("Call API");
        callApiButton.setId("callApiButton"); // Set ID for styling
        callApiButton.setOnAction(e -> callDogAPI());

        Button showInNewWindowButton = new Button("Show in New Window");
        showInNewWindowButton.setId("showInNewWindowButton"); // Set ID for styling
        showInNewWindowButton.setOnAction(e -> showInNewWindow(primaryStage));

        root.getChildren().addAll(dogImageView, callApiButton, showInNewWindowButton);

        primaryStage.setScene(scene);
    }

    public void show() {
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Dog API Viewer");
        primaryStage.show();
    }

    private void callDogAPI() {
        // Your code to fetch and display the dog image from the API
        // ... (same as before)
    }

    private void showInNewWindow(Stage primaryStage) {
        // Your code to display the image in a new window
        // ... (same as before)
    }
}
