package Strategy;
//Import thing
import java.awt.event.*;

import javax.swing.JTextArea;

import Bridge.*;
import Decorator.Componet;
import Decorator.General;


public class ChineseFont2 implements MenuItemStrategy{
	private JTextArea textArea1;
	public ChineseFont2(JTextArea jta , Componet c) {
		textArea1 = jta;
		c = new General();
	}
	
	public void actionPerformed(ActionEvent e) {
	       Abstraction abstraction = new GuiAbstraction(textArea1, "·L³n¥¿¶ÂÅé", new FontConcreteImp());
	       abstraction.start();
	}

}

