package ChainOfResponsibility;

import javax.swing.JTextArea;

import Form.GUIfacade;

//hander�n��@������
public abstract class fileHandler {
	//�C�ӤH���n���D�U�@�ӭn�B�z���H�O��
	public fileHandler next=null;
	
	fileHandler(fileHandler next){
		this.next=next;
		
	}
	//�ǤJ�ثe�s�ɪ����A�ΨӧP�_
	//�ǤJtextarea��notepadUI�O�x�s��}���ɮת��y�k�ݭn
	public abstract void run(String state,JTextArea t,GUIfacade j);
	//�ǵ��U�@�ӤH
	public void tonext(String state,JTextArea t,GUIfacade j) {
		if(next!=null) {
			next.run(state,t,j);
		}else {
			j.closeDialog();
		}
	}
}
