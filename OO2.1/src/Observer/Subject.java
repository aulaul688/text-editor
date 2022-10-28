package Observer;

import javax.swing.JLabel;
import javax.swing.JTextArea;

public interface Subject {
	public void add(Observer o);
	public void remove(Observer o);
	public void notifying(JTextArea textarea,JLabel state);
}
