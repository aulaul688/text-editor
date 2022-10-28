package Strategy;
//Import thing
import java.awt.event.*;

import javax.swing.JTextArea;

import Bridge.*;


public class redFont implements MenuItemStrategy{
	private JTextArea textArea1;
	public redFont(JTextArea jta) {
		textArea1 = jta;
	}
	
	public void actionPerformed(ActionEvent e) {
	       Abstraction abstraction = new GuiAbstraction(textArea1, 255, 0, 0, new ColorConcreteImp());
	       abstraction.start();
	}

}

