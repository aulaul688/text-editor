package Strategy;
//Import thing
import java.awt.event.*;

import javax.swing.JTextArea;

import ChainOfResponsibility.fileHandler;
import Form.GUIfacade;



public class exitApplication implements MenuItemStrategy{
	private GUIfacade fa ;
	private JTextArea textArea1;
	private fileHandler hr;
	public static String state; 
	public exitApplication(GUIfacade f ,fileHandler hr ,String state) {
		this.fa = f;
		this.textArea1 =f.getTextArea();
		this.hr = hr;
		this.state = state;
	}
	public void changeState(String state ) {
		this.state = state;
		
	}
	public void actionPerformed(ActionEvent e) {		hr.run(state, textArea1, fa);
	}

}

