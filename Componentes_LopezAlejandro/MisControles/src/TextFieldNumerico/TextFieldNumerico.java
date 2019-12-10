/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextFieldNumerico;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
/**
 *
 * @author Alejandro
 */
public class TextFieldNumerico extends TextField
{    
        
        //No permite escribir texto, solo numeros
            @Override
            public void replaceText(int start, int end, String text)
            {
                if (!text.matches("[a-z, A-Z]"))
                {
                    super.replaceText(start, end, text);
                                      
                }
            }

            @Override
            public void replaceSelection(String text)
            {
                if (!text.matches("[a-z, A-Z]"))
                {
                    super.replaceSelection(text);
                   
                }
            }
            
            
            
        };
    
