package Strategy;
import java.awt.event.*;
import javax.swing.*;


public class newFile implements MenuItemStrategy{
	private JTextArea textArea1 = new JTextArea();
	public newFile(JTextArea jta) {
		this.textArea1 =jta;
	}
	public void actionPerformed(ActionEvent e) {
		textArea1.setText("");		
	}

}
