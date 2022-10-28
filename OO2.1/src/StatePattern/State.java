package StatePattern;

import java.awt.event.ActionEvent;

public interface State {

    public void arialActionPerformed(ActionEvent e);
    public void impactActionPerformed(ActionEvent e);
    public void caveatActionPerformed(ActionEvent e);

}