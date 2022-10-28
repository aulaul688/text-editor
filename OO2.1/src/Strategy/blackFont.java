package Strategy;
//Import thing
import java.awt.event.*;

import javax.swing.JTextArea;

import Bridge.*;


public class blackFont implements MenuItemStrategy{
	private JTextArea textArea1;
	public blackFont(JTextArea jta) {
		textArea1 = jta;
	}
	
	public void actionPerformed(ActionEvent e) {
	       Abstraction abstraction = new GuiAbstraction(textArea1, 0, 0, 0, new ColorConcreteImp());
	       abstraction.start();
	}

}

