package StatePattern;

import java.awt.event.ActionEvent;

public class ImpactState implements State {

    public Fontx mFont;

    public ImpactState(Fontx font){
        mFont = font;
    }

    public void arialActionPerformed(ActionEvent e) {
        System.out.println("Now is Arial");
    }

    public void impactActionPerformed(ActionEvent e) {
        System.out.println("Now is Impact");
    }

    public void caveatActionPerformed(ActionEvent e) {
        System.out.println("Now is Arial");
    }
}