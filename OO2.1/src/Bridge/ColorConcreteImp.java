package Bridge;

import javax.swing.*;
import java.awt.*;

public class ColorConcreteImp implements Implementor {
    @Override
    public JTextArea startModify(JTextArea textArea, String fontName) {
        return null;
    }

    @Override
    public JTextArea startModify(JTextArea textArea, int x, int y, int z) {
        textArea.setForeground(new Color(x,y,z));
        return textArea;
    }
}