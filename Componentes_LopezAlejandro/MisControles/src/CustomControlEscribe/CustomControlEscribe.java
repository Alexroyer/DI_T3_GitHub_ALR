/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomControlEscribe;
import java.io.IOException;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

import javafx.beans.property.StringProperty;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
/**
 *
 * @author Alejandro
 */
public class CustomControlEscribe extends HBox {
    @FXML private TextField textField;
    @FXML private Button btn;
    
private ObjectProperty<EventHandler<MouseEvent>> propertyOnAction = new SimpleObjectProperty<EventHandler<MouseEvent>>(); 


    public CustomControlEscribe() {  
        
         
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("custom_control_escribe.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        
        try {
            fxmlLoader.load();            
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
    
    public String getText() {
        return textProperty().get();
    }
    
    public void setText(String value) {
        textProperty().set(value);
    }
    
    public StringProperty textProperty() {
        return textField.textProperty();                
    }
        
  
    public Button getBtn()
    {
        return btn;
    }

    public void setBtn(Button btn)
    {
        this.btn = btn;
    }
    
  

public final ObjectProperty<EventHandler<MouseEvent>> onActionProperty()
{    
    return propertyOnAction; 
}


public final void setOnAction(EventHandler<MouseEvent> handler)  //Un método para establecer un eventhandler cuando se accione el botón
{ 
        propertyOnAction.set(handler); 
}

public final EventHandler<MouseEvent> getOnAction() 
{ 
    return propertyOnAction.get(); 
}

}


