package Factory;

import javax.swing.JDialog;

public abstract class Dialog  extends JDialog implements MessageDialog{
	abstract public void showMessageDialog() ;


    abstract public  void showMessageDialog(String result, int num) ;


    abstract public void showMessageDialog(int letter, int num) ;
        
}
