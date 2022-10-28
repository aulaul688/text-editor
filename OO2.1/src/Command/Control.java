package Command;

import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import Form.*;
import Strategy.MenuItemStrategy;

public class Control implements MenuItemStrategy {

	private JTextArea textArea1 ;
	private boolean Bclicked =false;
	private EditInvoker invoker = new EditInvoker();
	private Command boldCmd ;
	private Command italicCmd ;
	
	public Control (GUIfacade gui) {
		textArea1  = gui.getTextArea();
		boldCmd = new BoldText(textArea1 );
		italicCmd = new ItalicText(textArea1 );
		invoker.addCommand(boldCmd);
		invoker.addCommand(italicCmd);
	}	
	public void actionPerformed(ActionEvent e) {		
		

		
		if(Bclicked == false) {			
			invoker.btnDo();
			
			Bclicked = true;
			
		}else {
			invoker.btnUndo();
			Bclicked = false;		
		}				
	}
}

