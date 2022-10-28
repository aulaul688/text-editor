package ChainOfResponsibility;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import Form.GUIfacade;



public class saveHandler extends fileHandler{
	public saveHandler(fileHandler next) {
		super(next);
	}
	
	
	@Override
	public void run(String state,JTextArea t,GUIfacade j) {
		if(state=="save it") {
			JFileChooser filechooser = new JFileChooser();
		      int result = filechooser.showSaveDialog(j);
		      if (result == JFileChooser.APPROVE_OPTION) {
		          try {
		              File file = filechooser.getSelectedFile();
		              FileWriter fw = new FileWriter(file);
		              BufferedWriter bw = new BufferedWriter(fw);
		              String text = t.getText();
		              fw.write(text);
		              fw.close();
		              bw.close();
		              state="done";
		          } catch (Exception ex) {
		              JOptionPane.showMessageDialog(j, "Oops! Mistakes happened when open the document");
		          }
		      }
		}
		tonext(state,t,j);
	}	
}
