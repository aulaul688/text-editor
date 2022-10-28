package Visitor;

import java.util.*;

import javax.swing.JTextArea;

import AbstractFactory.Menu;
import AbstractFactory.MenuItem;

import java.awt.*;

public class NightMode implements AppearanceVisitor {
	
	public void visit(MenuAppearance menus) {
		ArrayList<Menu> allmenus = menus.getAllMenus();
		
//		for(Menu item : allmenus) {
//			item.setForeground(Color.WHITE);
//			item.setBackground(Color.BLACK);
//		}
		
	}
	
	public void visit(MenuItemsAppearance items) {
		ArrayList<MenuItem> allitems = items.getAllMenuItems();
		
//		for(MenuItem item : allitems) {
//			item.setForeground(Color.WHITE);
//			item.setBackground(Color.BLACK);
//		}
			
	}
			
	public void visit(TextAreaAppearance jta) {
		JTextArea textArea1 = jta.getTextArea();
		textArea1.setForeground(Color.WHITE);
		textArea1.setBackground(Color.BLACK);
	}
}
