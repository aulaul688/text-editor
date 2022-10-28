package Strategy;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.*;

import ChainOfResponsibility.*;
import Form.*;

public class openFile implements MenuItemStrategy{
	private GUIfacade fa ;
	private JTextArea textArea1;
	private fileHandler hr;
	public static String state; 
	
	public openFile(GUIfacade f ,fileHandler hr ,String state) {
		this.fa = f;
		this.textArea1 =f.getTextArea();
		this.hr = hr;
		this.state = state;
	}
	public void changeState(String state ) {
		this.state = state;
		;
	}
	public void actionPerformed(ActionEvent e) {
		hr.run(state, textArea1, fa);
	}

}
