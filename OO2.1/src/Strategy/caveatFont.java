package Strategy;
//Import thing
import java.awt.event.*;


import javax.swing.JTextArea;

import Bridge.*;


public class caveatFont implements MenuItemStrategy{
	private JTextArea textArea1;
	public caveatFont(JTextArea jta) {
		textArea1 = jta;
	}
	
	public void actionPerformed(ActionEvent e) {
	       Abstraction abstraction = new GuiAbstraction(textArea1, "Caveat", new FontConcreteImp());
	       abstraction.start();
	}

}

