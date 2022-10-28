package Strategy;
//Import thing
import java.awt.event.*;

import javax.swing.JTextArea;

import Bridge.*;
import Decorator.Componet;
import Decorator.General;


public class ChineseFont3 implements MenuItemStrategy{
	private JTextArea textArea1;
	public ChineseFont3(JTextArea jta , Componet c) {
		textArea1 = jta;
		c = new General();
	}
	
	public void actionPerformed(ActionEvent e) {
	       Abstraction abstraction = new GuiAbstraction(textArea1, "º–∑¢≈È", new FontConcreteImp());
	       abstraction.start();
	}

}

