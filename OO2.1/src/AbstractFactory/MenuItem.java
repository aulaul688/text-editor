package AbstractFactory;

import javax.swing.*;

import Strategy.MenuItemStrategy;

public abstract class MenuItem extends JMenuItem {
	public abstract void setContent(String text);
	public abstract void setActionListener(MenuItemStrategy mItemStrategy);
	
}
