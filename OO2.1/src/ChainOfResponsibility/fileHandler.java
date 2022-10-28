package ChainOfResponsibility;

import javax.swing.JTextArea;

import Form.GUIfacade;

//hander要實作的介面
public abstract class fileHandler {
	//每個人都要知道下一個要處理的人是誰
	public fileHandler next=null;
	
	fileHandler(fileHandler next){
		this.next=next;
		
	}
	//傳入目前存檔的狀態用來判斷
	//傳入textarea跟notepadUI是儲存跟開啟檔案的語法需要
	public abstract void run(String state,JTextArea t,GUIfacade j);
	//傳給下一個人
	public void tonext(String state,JTextArea t,GUIfacade j) {
		if(next!=null) {
			next.run(state,t,j);
		}else {
			j.closeDialog();
		}
	}
}
