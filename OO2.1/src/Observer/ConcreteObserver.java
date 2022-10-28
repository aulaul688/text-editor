package Observer;

import javax.swing.JLabel;
import javax.swing.JTextArea;


public class ConcreteObserver implements Observer{
	//使用者名字
		public void update(JTextArea textarea, JLabel state) {
			state.setText("L:"+textarea.getLineCount());
		}
}
