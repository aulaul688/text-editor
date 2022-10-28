package Strategy;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;
import Factory.DialogFactory;
import Factory.MessageDialog;
import IteratorCounter.ConcreteList;
import IteratorCounter.CounterList;
import IteratorCounter.Iterator;

public class wordCounter implements MenuItemStrategy{
	private JTextArea textArea1;
	private DialogFactory dialogfactory;
	
	public wordCounter(JTextArea jta, DialogFactory df) {
		this.textArea1 = jta;
		this.dialogfactory = df;
	}
	
	public void actionPerformed(ActionEvent e) {
		 CounterList listA = new ConcreteList(textArea1.getText());//input
	       Iterator iterator = listA.getIterator();
	       int charaCount = 0;
	       int numCount = 0;

	       while (iterator.hasNext()) {
	           String val = iterator.next();
	           if (val.matches("[a-zA-Z]")) {
	               charaCount++;
	           } else if (val.matches("[0-9]")) {
	               numCount++;
	           }
	       }
	       
	       /*origin
	       Creator factoryMethod = new CreateWordCount();				
	       MessageDialog messageDialog = factoryMethod.factoryMethod();
	       */
	       
	       //new
	       MessageDialog wc = dialogfactory .createDialog("Word Count","WordCount");
	       wc.showMessageDialog(charaCount, numCount);
	}
}
