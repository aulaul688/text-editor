package Strategy;
import Visitor.*;

import java.awt.Color;
import java.awt.event.ActionEvent;

import Form.*;

public class nightModeAct implements MenuItemStrategy{
	private MenuAppearance menuAp;
	private MenuItemsAppearance itemAp;
	private TextAreaAppearance textarea;
	
	
	public nightModeAct(GUIfacade g ) {
		
		menuAp = new MenuAppearance(g.getAllMenu());
		itemAp = new MenuItemsAppearance(g.getAllMenuItems());
		textarea = new TextAreaAppearance(g.getTextArea());
		
	}
	
	public void actionPerformed(ActionEvent e) {
		AppearanceVisitor night = new NightMode();
		menuAp.accept(night);
		itemAp.accept(night);
		textarea.accept(night);
		
	}

}
