package Visitor;

import java.util.ArrayList;

import javax.swing.JTextArea;

import AbstractFactory.Menu;
import AbstractFactory.MenuItem;

public class MenuAppearance extends Items {
	ArrayList<Menu> menus;
	public MenuAppearance(ArrayList<Menu> menu) {
		this.menus = menu;
	}
	
	public ArrayList<Menu> getAllMenus(){
		return menus;
	}
	
	
	
	public void accept(AppearanceVisitor visitor) {
		visitor.visit(this);
	};

}
