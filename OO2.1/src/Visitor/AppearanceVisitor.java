package Visitor;

import javax.swing.JTextArea;

import AbstractFactory.Menu;
import AbstractFactory.MenuItem;

public interface AppearanceVisitor {
	
	public void visit(MenuAppearance menus);
		
	public void visit(MenuItemsAppearance items);
	
	public void visit(TextAreaAppearance textArea);
}
