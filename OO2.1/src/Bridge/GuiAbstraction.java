package Bridge;

import javax.swing.*;

public class GuiAbstraction extends Abstraction {
    JTextArea textArea;
    String fontName;
    int x;
    int y;
    int z;

    public GuiAbstraction(JTextArea textArea, String fontName, Implementor os) {
        super(os);
        this.fontName = fontName;
        this.textArea = textArea;

    }

    public GuiAbstraction(JTextArea textArea, int x, int y, int z, Implementor os) {
        super(os);
        this.textArea = textArea;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public JTextArea start() {
        if(this.fontName == null){
            os.startModify(textArea,x, y, z);
        }else{
            os.startModify(textArea, fontName);
        }
        return textArea;
    }
}
