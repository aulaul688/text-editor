package Bridge;

import javax.swing.*;

public interface Implementor {
    // These are the behaviors that have the strong connection with Font and Color
    // Encapsulate these behaviors
    public JTextArea startModify(JTextArea textArea, String fontName);
    public JTextArea startModify(JTextArea textArea, int x, int y, int z);
}
