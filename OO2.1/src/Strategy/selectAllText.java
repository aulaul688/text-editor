package Strategy;
import java.awt.event.*;
import javax.swing.*;


public class selectAllText implements MenuItemStrategy{
	private JTextArea textArea1 ;
	public selectAllText(JTextArea jta) {
		this.textArea1 =jta;
	}
	public void actionPerformed(ActionEvent e) {
		textArea1.selectAll();		
	}

}
