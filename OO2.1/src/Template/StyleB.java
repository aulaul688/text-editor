package Template;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextArea;

public class StyleB extends StyleTemplate{
	public StyleB(JTextArea t){
		super(t);
	}
	@Override
	public void setcolor() {
		textArea1.setForeground(new Color(178,34,34));
	}
	@Override
	public void setfontname() {
		f = textArea1.getFont();
		textArea1.setFont(new Font("Times New Roman",f.getStyle(),f.getSize()));
	}
	@Override
	public void setfontstyle() {
		f = textArea1.getFont();
		textArea1.setFont(new Font(f.getName(),Font.ITALIC,f.getSize()));
	}
}
