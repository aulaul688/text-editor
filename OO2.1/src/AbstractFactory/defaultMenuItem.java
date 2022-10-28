package AbstractFactory;

import javax.swing.*;

import Strategy.MenuItemStrategy;


public class defaultMenuItem extends MenuItem{
	private MenuItemStrategy MIS;
	defaultMenuItem(){
		
		this.setFont(this.getFont().deriveFont(this.getFont().getSize() + 4f));
	}
	
	
	public void setContent(String text) {
		this.setText(text);
	}
	public void setActionListener(MenuItemStrategy mItemStrategy) {
		MIS = mItemStrategy;
		this.addActionListener(MIS);
	}
	
	

	
	

}
