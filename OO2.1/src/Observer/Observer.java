package Observer;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public interface Observer {
	public void update(JTextArea textarea, JLabel state);
}
