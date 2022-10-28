package AbstractFactory;

import java.awt.Color;
import java.awt.*;


public class specialMenu extends Menu {
	specialMenu(){
		this.setFont(new Font("sans-serif", Font.PLAIN, 20));
		this.setForeground(Color.red);
	}
	
	public void setContent(String text) {
		this.setText(text);
	}
	
	public void addMenuItem(MenuItem item) {
		this.add(item);
	}
}
