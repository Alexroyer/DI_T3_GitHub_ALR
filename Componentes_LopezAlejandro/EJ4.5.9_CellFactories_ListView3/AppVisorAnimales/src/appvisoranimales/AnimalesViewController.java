
package appvisoranimales;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.InvalidationListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author Alejandro
 */
public class AnimalesViewController implements Initializable
{
  
    private ObservableList<Animal> listaObservable = FXCollections.observableArrayList();
 
    
    @FXML
    private BorderPane AnimalRootView;
    @FXML
    private ListView<Animal> lista;
    @FXML
    private ImageView Imagen;
    
       
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        
        Animal gato = new Animal("Gato", "imagenes\\gato.jpg","imagenes\\gato.jpg");
        Animal perro = new Animal("Perro", "imagenes\\perro.jpg", "imagenes\\perro.jpg");
        Animal ardilla = new Animal("Ardilla", "imagenes\\ardilla.jpg" ,"imagenes\\ardilla.jpg");
        
        listaObservable.addAll(gato, perro, ardilla ); //Añade los animales a la lista observable de animales
        
        lista.setItems(listaObservable); //Añade los items del observable-list a lista
        
              lista.setCellFactory((ListView<Animal> l) -> new CeldaImagenTexto());

        lista.getSelectionModel().selectedItemProperty().addListener(
                (lista, old, nuevo) ->
        {

            Imagen.setImage(new Image(nuevo.getImagenGrande())); //Establece la imagen del imageView

        });

    }

    
    
}
