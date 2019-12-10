/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebamicontrol;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import micontrol.MiControl;

/**
 *
 * @author Alejandro
 */
public class PruebaMiControl extends Application
{
    
    @Override
    public void start(Stage primaryStage)
    {
        
        
        StackPane root = new StackPane();      
        
        Scene scene = new Scene(root, 300, 270);
        root.setStyle("-fx-background-color: lightSalmon"); 
        Label etiqueta = new Label();
        etiqueta.setMaxSize(250, 40);
        etiqueta.setTranslateX(60);
        
        
        root.getChildren().add(etiqueta);
        MiControl control = new MiControl(); //Hereda todas las propiedades de region:
     
        control.setMaxWidth(120);
        control.setMaxHeight(50);
        control.setTranslateY(-60);
        
        EventHandler<MouseEvent> manejador = new EventHandler<MouseEvent>() {
            
            @Override
            public void handle(MouseEvent event) {
               
                etiqueta.setText("Se ha pulsado MiControl"); //Texto a mostrar
            }
        };
        
        control.setOnAction(manejador);
       
        
                
        root.getChildren().add(control);
                
        primaryStage.setTitle("Prueba de MiControl");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
