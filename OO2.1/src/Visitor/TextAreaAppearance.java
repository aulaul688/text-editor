package Visitor;

import java.util.ArrayList;

import javax.swing.JTextArea;

import AbstractFactory.Menu;
import AbstractFactory.MenuItem;

public class TextAreaAppearance extends Items {
	JTextArea textArea;
	public TextAreaAppearance(JTextArea jta) {
		this.textArea = jta;
	}
	
	public JTextArea getTextArea() {
		return textArea;
	}
	
	
	public void accept(AppearanceVisitor visitor) {
		visitor.visit(this);
	};

}
