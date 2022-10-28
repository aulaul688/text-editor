package Template;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

abstract public class StyleTemplate implements ActionListener{
    JTextArea textArea1;
	Font f;
	public StyleTemplate(JTextArea t){
		textArea1 = t; //get JTextArea
	}
	public void setcolor() {
		textArea1.setForeground(new Color(0,0,0));
	}
	public void setfontname() {
		f = textArea1.getFont(); 
		textArea1.setFont(new Font("Arial",f.getStyle(),f.getSize()));
	}
	public void setfontstyle() {
		f = textArea1.getFont();
		textArea1.setFont(new Font(f.getName(),Font.PLAIN,f.getSize()));
	}
	public void setfontsize() {
		f = textArea1.getFont();
		textArea1.setFont(new Font(f.getName(),f.getStyle(),20));
	}
	public boolean changesize() { 	//hookMethod
		return false;
	}
	final public void actionPerformed(ActionEvent e) { //TemplateMethod
		setcolor();
		setfontname();
		setfontstyle();
		if(changesize()) {
		setfontsize();
		}
	 }

}
