package Visitor;

import java.util.ArrayList;

import javax.swing.JTextArea;

import AbstractFactory.Menu;
import AbstractFactory.MenuItem;

public class MenuItemsAppearance extends Items {
	ArrayList<MenuItem> items;
	public MenuItemsAppearance(ArrayList<MenuItem> item) {
		this.items = item;
	}
	public ArrayList<MenuItem> getAllMenuItems(){
		return items;
	}
	
	public void accept(AppearanceVisitor visitor) {
		visitor.visit(this);
	};

}
