package Command;

import java.util.ArrayList;

//client
public class EditInvoker {
	private ArrayList<Command> cmdList = new ArrayList<Command>();
	private Caretaker caretaker = new Caretaker();	
	public void addCommand(Command cmd) {
		this.cmdList.add(cmd);
		System.out.println(cmdList.size());
	}
	
	public void removeCommand(int index) {
		cmdList.remove(index);
	}
	public void btnDo() {
		for(Command cmd : cmdList) {
		//����e���x�s��caretaker
		caretaker.addMemento(cmd.saveToMemento());
		//����
		cmd.execute();		
		}

	}
	public void btnUndo() {
		//�^�_�ܥ��e�x�s�bcaretaker�����A
		for(int i = cmdList.size()-1 ; i >=0 ; i--) {		
			Command cmd = cmdList.get(i);
			cmd.undo(caretaker.getMemento(i));
			
		}	
	}
}

