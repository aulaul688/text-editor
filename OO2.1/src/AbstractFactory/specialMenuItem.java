package AbstractFactory;

import java.awt.*;


import Strategy.MenuItemStrategy;

public class specialMenuItem extends MenuItem{
	private MenuItemStrategy MIS;
	specialMenuItem(){
		this.setFont(new Font("sans-serif", Font.BOLD, 16));
		this.setForeground(new Color(255,153,18));
		
	}
	
	
	public void setContent(String text ) {
		this.setText(text);
	}
	public void setActionListener(MenuItemStrategy mItemStrategy) {
		MIS = mItemStrategy;
		this.addActionListener(MIS);
	}
}
