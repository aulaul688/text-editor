package Strategy;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import Decorator.*;

public class italicFont implements MenuItemStrategy {
	private JTextArea textArea1;	
	public Componet gen;
	public boldFont bof;
	public italicFont(JTextArea jta , Componet g,boldFont bof) {
		textArea1 = jta;
		gen = g;
		this.bof = bof;
	}
	
	public void actionPerformed(ActionEvent e) {
		if(textArea1.getFont().getStyle()==Font.ITALIC) {
			gen = new General();
			bof.gen = gen;
			textArea1.setFont(new Font(textArea1.getFont().getName(),gen.word(),textArea1.getFont().getSize()));
		}
		else if(textArea1.getFont().getStyle()==Font.ITALIC+Font.BOLD) {
			gen = new General();
			gen = new Decorator.bold(gen);
			bof.gen = gen;
			textArea1.setFont(new Font(textArea1.getFont().getName(),gen.word(),textArea1.getFont().getSize()));
		}
		else {
		gen = new italic(gen);
		bof.gen = gen;
        textArea1.setFont(new Font(textArea1.getFont().getName(),gen.word(),textArea1.getFont().getSize()));		
		}
	}
}
