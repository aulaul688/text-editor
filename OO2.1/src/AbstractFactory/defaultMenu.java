package AbstractFactory;

import javax.swing.*;


public class defaultMenu extends Menu{
	
	defaultMenu(){
		this.setFont(this.getFont().deriveFont(this.getFont().getSize() + 4f));
	}
	
	public void setContent(String text) {
		this.setText(text);
	}
	
	public void addMenuItem(MenuItem item) {
		this.add(item);
	}
	

	
}
