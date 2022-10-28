package StatePattern;

import java.awt.event.ActionEvent;
import Form.*;

import Bridge.Abstraction;
import Bridge.FontConcreteImp;
import Bridge.GuiAbstraction;

public class CaveatState implements State {

    public Fontx mFont;

    public CaveatState(Fontx font){
        mFont = font;
    }

    public void arialActionPerformed(ActionEvent e) {
    	Abstraction abstraction = new GuiAbstraction(GUIfacade.textArea, "Arial", new FontConcreteImp());
    	abstraction.start();
        System.out.println("Now is Arial");
    }

    public void impactActionPerformed(ActionEvent e) {
    	Abstraction abstraction = new GuiAbstraction(GUIfacade.textArea, "Impact", new FontConcreteImp());
    	abstraction.start();
        System.out.println("Now is Impact");
    }

    public void caveatActionPerformed(ActionEvent e) {
    	Abstraction abstraction = new GuiAbstraction(GUIfacade.textArea, "Caveat", new FontConcreteImp());
    	abstraction.start();
        System.out.println("Now is Caveat");
    }

}