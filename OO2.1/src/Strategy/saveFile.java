package Strategy;
import java.awt.event.*;

import java.io.BufferedWriter;
import java.io.File;

import java.io.FileWriter;

import javax.swing.*;
import Form.*;

public class saveFile implements MenuItemStrategy{
	private GUIfacade fa ;
	private JTextArea textArea1;
	
	public saveFile(GUIfacade f) {
		this.fa = f;
		this.textArea1 =f.getTextArea();
	}
	
	public void actionPerformed(ActionEvent e) {
		 JFileChooser filechooser = new JFileChooser();
	      int result = filechooser.showSaveDialog(fa);
	      if (result == JFileChooser.APPROVE_OPTION) {
	          try {
	              File file = filechooser.getSelectedFile();
	              FileWriter fw = new FileWriter(file);
	              BufferedWriter bw = new BufferedWriter(fw);
	              String text = textArea1.getText();
	              fw.write(text);
	              fw.close();
	              bw.close();
	          } catch (Exception ex) {
	              JOptionPane.showMessageDialog(fa, "Oops! Mistakes happened when open the document");
	          }
	      }
	}

}
