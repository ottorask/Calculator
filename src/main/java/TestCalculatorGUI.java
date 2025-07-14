import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestCalculatorGUI extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file using a file path for manual testing
        FXMLLoader loader = new FXMLLoader(new java.io.File("src/main/resources/fxml/calculator.fxml").toURI().toURL());
        Parent root = loader.load();
        
        // Set up the main window
        primaryStage.setTitle("Calculator GUI Test");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        
        // Show the window
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
} 