import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculatorApp extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file using a file path for manual testing
        FXMLLoader loader = new FXMLLoader(new java.io.File("src/main/resources/fxml/calculator.fxml").toURI().toURL());
        Parent root = loader.load();
        
        // Set up the main window
        primaryStage.setTitle("Calculator");
        Scene scene = new Scene(root, 400, 500); // Set width to 400px and height to 500px
        
        // Load CSS file
        String cssPath = new java.io.File("src/main/resources/calculator.css").toURI().toURL().toExternalForm();
        scene.getStylesheets().add(cssPath);
        
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        
        // Show the window
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
} 