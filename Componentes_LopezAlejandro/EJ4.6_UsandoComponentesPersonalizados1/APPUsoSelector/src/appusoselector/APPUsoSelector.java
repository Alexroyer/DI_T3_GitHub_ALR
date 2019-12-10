/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusoselector;
package src.SelectorDeslizamiento;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


import javafx.application.Application;

/**
 *
 * @author Alejandro
 */
public class APPUsoSelector extends Application
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
       
       
        
        Pane panel = new Pane();
       
        
        SelectorDeslizamiento s = new SelectorDeslizamiento();
       
        ArrayList<String> lista = new ArrayList<String>();
                lista.add("hola");
                lista.add("hop");
        s.setItems(lista);
        s.setRepetitive(true);
        s.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                System.out.println("Evento lanzado a la vez por los dos botones");
            }
            }); 
   
        panel.getChildren().add(s);
        Scene scene = new Scene(panel);        
        primaryStage.setTitle("SELECTOR DESLIZAMIENTO");
        primaryStage.setScene(scene);
        
        
        primaryStage.show();
        
        
        
    }
}
