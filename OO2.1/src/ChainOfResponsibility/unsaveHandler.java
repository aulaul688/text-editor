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
			null,"檔案已修改，是否儲存？",
			"儲存檔案？",JOptionPane.YES_NO_OPTION,
			JOptionPane.WARNING_MESSAGE,null);
			
			switch(option){
			// 確認檔案儲存
			case JOptionPane.YES_OPTION:
			state="save it";
            break;
            // 放棄檔案儲存
			case JOptionPane.NO_OPTION:
			state="done";
			break;
			}
		}
		tonext(state,t,j);
	}
		
}
