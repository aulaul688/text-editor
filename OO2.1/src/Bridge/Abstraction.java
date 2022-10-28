package Bridge;

import javax.swing.*;

public abstract class Abstraction {

    protected Implementor os = null;

    public Abstraction(Implementor os) {
        this.os = os;
    }

    public abstract JTextArea start();
}
