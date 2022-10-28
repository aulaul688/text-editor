package Strategy;
//Import thing
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import Form.*;


public class BGcolorChooser implements MenuItemStrategy{	
	private GUIfacade fa;
	private JTextArea textArea1;
	
	//Constructor
	public BGcolorChooser(GUIfacade f ){ 
		fa = f;
		textArea1 = fa.getTextArea();
		
	}
	
	//
	public void actionPerformed(ActionEvent e) {
		 Color result = JColorChooser.showDialog(fa, "BackGroundColor", Color.WHITE);

         textArea1.setBackground(result);
	}
	
}
