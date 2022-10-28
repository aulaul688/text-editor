package Template;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

public class StyleA extends StyleTemplate{
	public StyleA(JTextArea t){
		super(t);
	}
	@Override
	public void setfontname() {
		f = textArea1.getFont();
		textArea1.setFont(new Font("º–∑¢≈È",f.getStyle(),f.getSize()));
	}
	@Override
	public void setcolor() {
		textArea1.setForeground(new Color(128,42,42));
	}
	
}
