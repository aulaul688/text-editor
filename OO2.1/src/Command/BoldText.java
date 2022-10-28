package Command;

import javax.swing.JTextArea;
import java.awt.Font;



// Originator
public class BoldText implements Command{
	private JTextArea textArea1 ;
	private Font textAreaFont;
	
	public BoldText(JTextArea jta) {
		this.textArea1 = jta;		
	}
	
	public void execute() {
		if(textArea1.getFont().getStyle() == Font.PLAIN || textArea1.getFont().getStyle() == Font.BOLD ) {
			textAreaFont = new Font(textArea1.getFont().getName(),Font.BOLD,textArea1.getFont().getSize());
			textArea1.setFont(textAreaFont);
		}else {
			textAreaFont = new Font(textArea1.getFont().getName(),Font.BOLD + 
					textArea1.getFont().getStyle(),textArea1.getFont().getSize());
			textArea1.setFont(textAreaFont);
		}
		
	}
	
	public Memento saveToMemento() {
		return new Memento(textArea1.getFont());
	}
	
	public void undo(Memento memento) {
		textAreaFont = memento.getSaveFont();
		textArea1.setFont(textAreaFont);
	}

}
