package Strategy;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import Decorator.*;

public class boldFont implements MenuItemStrategy {
	private JTextArea textArea1;	
	public Componet gen;
	public italicFont itf;
	public boldFont(JTextArea jta , Componet g,italicFont itf) {
		textArea1 = jta;
		gen = g;
		this.itf = itf;
	}
	
	public void actionPerformed(ActionEvent e) {
			if(textArea1.getFont().getStyle()==Font.BOLD) {
			gen = new General();
			itf.gen=gen;
			textArea1.setFont(new Font(textArea1.getFont().getName(),gen.word(),textArea1.getFont().getSize()));
		}
		else if(textArea1.getFont().getStyle()==Font.BOLD+Font.ITALIC) {
			gen = new General();
			gen = new Decorator.italic(gen);
			itf.gen=gen;
			textArea1.setFont(new Font(textArea1.getFont().getName(),gen.word(),textArea1.getFont().getSize()));
		}
		else {
		gen = new Decorator.bold(gen);
		itf.gen=gen;
        textArea1.setFont(new Font(textArea1.getFont().getName(),gen.word(),textArea1.getFont().getSize()));		
			}
		}
}
