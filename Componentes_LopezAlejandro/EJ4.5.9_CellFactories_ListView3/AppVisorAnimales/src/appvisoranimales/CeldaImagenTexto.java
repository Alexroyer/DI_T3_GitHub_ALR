
package appvisoranimales;

import java.awt.Font;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;

/**
 *
 * @author Alejandro
 * 
 */
public class CeldaImagenTexto extends ListCell <Animal>
{
    private VBox caja;
    private ImageView miniatura;
    private Label etiqueta;
    
    

    public CeldaImagenTexto()
    {        
        
        caja = new VBox();
        miniatura = new ImageView();
        etiqueta = new Label();       
        caja.setAlignment(Pos.CENTER); //Los hijos de la VBox centrados
        miniatura.setPreserveRatio(true); //Mantiene la relación de aspecto de la imagen
        miniatura.setFitHeight(100); //100 puntos de altura -> con el ratio la width se hará proporcional        
        etiqueta.setWrapText(true); //Envuelve su texto si es demasiado grande
        etiqueta.setTextAlignment(TextAlignment.CENTER); //Texto centrado
       
        caja.setPrefWidth(USE_PREF_SIZE);
        caja.getChildren().addAll(miniatura, etiqueta); //Añade los elementos a la VBox
        
        
    }
    
    
   
    @Override
    public void updateItem(Animal animal, boolean empty)
    {       
        super.updateItem(animal, empty);   
     
        if (animal != null)
        {
           etiqueta.setText(animal.getNombre()); //Cada celda se carga con la etiqueta con el nombre del animal (aqui podemos usar el animal.toString() tambien
           miniatura.setImage(new Image(animal.getImagenMiniatura())); 
           setGraphic(caja); //setGraphic recide un nodo cualquiera para mostrar gráficamente, en este caso nuestra VBox con sus componentes
             
            
        } else
        {
            setGraphic(null);
            
        }
    }
}
