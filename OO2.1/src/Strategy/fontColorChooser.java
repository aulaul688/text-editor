package Strategy;
//Import thing
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import Form.*;


public class fontColorChooser implements MenuItemStrategy{	
	private GUIfacade fa;
	private JTextArea textArea1;
	
	//Constructor
	public fontColorChooser(GUIfacade f ){ 

		fa = f;
		textArea1 = fa.getTextArea();
		
	}
	
	//
	public void actionPerformed(ActionEvent e) {
		 Color result = JColorChooser.showDialog(fa, "FontColor", Color.WHITE);

         textArea1.setForeground(result);
	}
	
}
