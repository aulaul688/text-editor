package ChainOfResponsibility;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import Form.GUIfacade;


public class openHandler extends fileHandler{
	
	public openHandler(fileHandler next) {
		super(next);
	}
	
	public void run(String state,JTextArea t,GUIfacade j) {
		if(state=="done" ||state=="yes") {
			JFileChooser filechooser = new JFileChooser();
		      int result = filechooser.showOpenDialog(j);
		      if (result == JFileChooser.APPROVE_OPTION) {
		          try {
		              File file = filechooser.getSelectedFile();
		              FileReader fr = new FileReader(file);
		              BufferedReader br = new BufferedReader(fr);
		              t.setText("");
		              String text;
		              while ((text = br.readLine()) != null) {
		                  t.append(text);
		              }
		              fr.close();
		              br.close();
		          } catch (Exception ex) {
		              JOptionPane.showMessageDialog(j, "Something wrong happened when open the file!");
		          }
		      }
		}
		
	}

}
