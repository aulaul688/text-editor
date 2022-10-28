package Memento;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Demo extends JFrame{
	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		JTextArea textArea1 = new JTextArea();
		
		// get textarea text and save
		originator.set(textArea1.getText());
		caretaker.addMemento(originator.saveToMemento());	
		
		
		originator.restoreFromMemento(caretaker.getMemento(1));
		originator.printState();
		
		Memento error = caretaker.getMemento(1);
		try {
			String state = error.getState("is he");
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}

}
