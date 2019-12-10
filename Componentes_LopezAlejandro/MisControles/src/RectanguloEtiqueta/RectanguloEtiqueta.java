/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RectanguloEtiqueta;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Region;
/**
 *
 * @author Alejandro
 */
public class RectanguloEtiqueta extends Region
{

    public RectanguloEtiqueta()
    {
        super();
        // marca la zona donde hacer click

        setStyle("-fx-border-color:red;");
        setPrefSize(100, 100);
        

        this.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event)
            {
                onActionProperty().get().handle(event);
                
            }
        }
        );       
    }

 
// En este caso se utiliza MouseEvent aquí solo porque llama desde onMouseEvent, se puede sustituir por cualquier tipo que se necesite 
private ObjectProperty<EventHandler<MouseEvent>> propertyOnAction = new SimpleObjectProperty<EventHandler<MouseEvent>>(); 

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