//Chapter 15  Exercise 15.7
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ChangeColor extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a pane to hold the circle
        Pane pane = new Pane();

        // Create a circle and set its initial color to white
        Circle circle = new Circle(100, 100, 50);
        circle.setFill(Color.WHITE);

        // Add the circle to the pane
        pane.getChildren().add(circle);

        // Create a scene and add the pane to it
        Scene scene = new Scene(pane, 300, 200);

        // Add a mouse pressed event handler to change color to black
        circle.setOnMousePressed(event -> {
            circle.setFill(Color.BLACK);
        });

        // Add a mouse released event handler to change color to white
        circle.setOnMouseReleased(event -> {
            circle.setFill(Color.WHITE);
        });

        // Set the scene and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Change Color On Mouse");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
