package Strategy;
//Import thing
import java.awt.event.*;
import Decorator.*;

import javax.swing.JTextArea;

import Bridge.*;


public class ChineseFont1 implements MenuItemStrategy{
	private JTextArea textArea1;
	public ChineseFont1(JTextArea jta , Componet c) {
		textArea1 = jta;
		c = new General();
	}
	
	public void actionPerformed(ActionEvent e) {
	       Abstraction abstraction = new GuiAbstraction(textArea1, "·s²Ó©úÅé", new FontConcreteImp());
	       abstraction.start();
	}

}

