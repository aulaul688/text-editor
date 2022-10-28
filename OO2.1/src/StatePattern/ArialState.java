package StatePattern;

import java.awt.event.ActionEvent;

import Bridge.Abstraction;
import Bridge.FontConcreteImp;
import Bridge.GuiAbstraction;
import Form.*;

public class ArialState implements State {

    public Fontx mFont;

    public ArialState(Fontx font){
        mFont = font;
    }

    public void arialActionPerformed(ActionEvent e) {
    	Abstraction abstraction = new GuiAbstraction(GUIfacade.textArea, "Airal", new FontConcreteImp());
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
        System.out.println("Now is Arial");
    }

}