package Observer;

import javax.swing.JLabel;
import javax.swing.JTextArea;


public class ConcreteObserver implements Observer{
	//�ϥΪ̦W�r
		public void update(JTextArea textarea, JLabel state) {
			state.setText("L:"+textarea.getLineCount());
		}
}
