package ChainOfResponsibility;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import Form.GUIfacade;



public class unsaveHandler extends fileHandler {

	public unsaveHandler(fileHandler next) {
		super(next);	
	}

	public void run(String state,JTextArea t,GUIfacade j) {
		if(state=="no") {
			int option =JOptionPane.showConfirmDialog(
			null,"�ɮפw�ק�A�O�_�x�s�H",
			"�x�s�ɮסH",JOptionPane.YES_NO_OPTION,
			JOptionPane.WARNING_MESSAGE,null);
			
			switch(option){
			// �T�{�ɮ��x�s
			case JOptionPane.YES_OPTION:
			state="save it";
            break;
            // ����ɮ��x�s
			case JOptionPane.NO_OPTION:
			state="done";
			break;
			}
		}
		tonext(state,t,j);
	}
		
}
