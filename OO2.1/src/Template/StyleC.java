package Template;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextArea;

public class StyleC extends StyleTemplate{
	public StyleC(JTextArea t){
		super(t);
	}
	@Override
	public void setcolor() {
		textArea1.setForeground(new Color(25,25,112));
	}
	@Override
	public void setfontname() {
		f = textArea1.getFont();
		textArea1.setFont(new Font("ß∫≈È",f.getStyle(),f.getSize()));
	}
	@Override
	public void setfontstyle() {
		f = textArea1.getFont();
		textArea1.setFont(new Font(f.getName(),Font.BOLD+Font.ITALIC,f.getSize()));
	}
	@Override
	public void setfontsize() {
		f = textArea1.getFont();
		textArea1.setFont(new Font(f.getName(),f.getStyle(),36));
	}
	@Override
	public boolean changesize() {
		return true;
	}
}
