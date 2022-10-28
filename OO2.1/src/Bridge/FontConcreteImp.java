package Bridge;

import javax.swing.*;
import java.awt.*;

public class FontConcreteImp implements Implementor {
    @Override
    public JTextArea startModify(JTextArea textArea, String fontName) {
        Font font = textArea.getFont(); // new an object called font 
        int style = font.getStyle(); // get the type of font
        int size = font.getSize(); // get the size of font
        textArea.setFont(new Font(fontName, style, size));
        return textArea;
    }

    @Override
    public JTextArea startModify(JTextArea textArea, int r, int g, int b) {
        return null;
    }
}
