package Strategy;
import java.awt.event.*;
import javax.swing.*;


public class cleanUpText implements MenuItemStrategy{
	private JTextArea textArea1;
	public cleanUpText(JTextArea jta) {
		this.textArea1 =jta;
	}
	public void actionPerformed(ActionEvent e) {
		textArea1.setText("");		
	}

}
