/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvisoranimales;

import appvisoranimales.Animal;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Alejandro
 */
public class VisorAnimalesController implements Initializable {
    Animal animal_tigre = new Animal("Tigre", "thumbgato.jpg", "tigre.jpg");
    Animal animal_pajaro = new Animal("Pajaro", "thumbpajaro.jpg", "perro.jpg");
    Animal animal_perro = new Animal("Perro", "thumbperro.jpg", "pajaro.jpg");
    ObservableList<Animal> lista_animales = FXCollections.observableArrayList();
    
    @FXML
    private ListView<Animal> list;
    @FXML
    private ImageView image;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
        lista_animales.add(animal_tigre);
        lista_animales.add(animal_pajaro);
        lista_animales.add(animal_perro);
        

        
        list.setItems(lista_animales);
        
        list.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Animal>() {
            @Override
            public void changed(ObservableValue<? extends Animal> observable, Animal oldValue, Animal newValue) {
                Image imagen = new Image(VisorAnimalesController.class.getResource(newValue.getImagenGrande()).toExternalForm());
                image.setImage(imagen);
            }
        });
    }    
    
}

