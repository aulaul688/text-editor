package Strategy;
//Import thing
import java.awt.event.*;

import javax.swing.JTextArea;

import Bridge.*;


public class impactFont implements MenuItemStrategy{
	private JTextArea textArea1;
	public impactFont(JTextArea jta) {
		textArea1 = jta;
	}
	
	public void actionPerformed(ActionEvent e) {
	       Abstraction abstraction = new GuiAbstraction(textArea1, "Impact", new FontConcreteImp());
	       abstraction.start();
	}

}

