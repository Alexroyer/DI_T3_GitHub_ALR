package textfield;

import javafx.scene.control.*;


public class MiTextField extends javafx.scene.control.TextField{
            Label ellabelinto;
            public MiTextField (Label labelinto){
                ellabelinto = labelinto;
                
            }
            public void replaceText(int start, int end, String text) {
                if (!text.matches("[a-z, A-Z]")) {
                    super.replaceText(start, end, text);   
                }
                ellabelinto.setText("Enter a numeric value");
            }
 
            @Override
            public void replaceSelection(String text) {
                if (!text.matches("[a-z, A-Z]")) {
                    super.replaceSelection(text);
                }
            } 
}
