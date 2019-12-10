
package appvisoranimales;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Alejandro
 */
public class AppVisorAnimales extends Application
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
          launch(args);
       
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
          
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AnimalesView.fxml"));
        Pane AnimalRootView = fxmlLoader.load(); 
               
        AnimalRootView.setStyle("-fx-font: 16px \"Consolas\"; ");
        
        Scene scene = new Scene(AnimalRootView);        
        primaryStage.setTitle("ANIMALES");
        primaryStage.setScene(scene);
        primaryStage.show();
        
       
        
    }
    
    
}
