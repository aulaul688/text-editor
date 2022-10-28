package Strategy;
//Import thing
import java.awt.event.*;

import javax.swing.JTextArea;

import Bridge.*;


public class arialFont implements MenuItemStrategy{
	private JTextArea textArea1;
	public arialFont(JTextArea jta) {
		textArea1 = jta;
	}
	
	public void actionPerformed(ActionEvent e) {
		Abstraction abstraction = new GuiAbstraction(textArea1, "Arial", new FontConcreteImp());
	       abstraction.start();
	}

}

