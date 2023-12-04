import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create and show the main scene
        MainScene mainScene = new MainScene(primaryStage);
        mainScene.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
