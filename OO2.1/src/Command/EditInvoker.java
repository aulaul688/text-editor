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
		//執行前先儲存至caretaker
		caretaker.addMemento(cmd.saveToMemento());
		//執行
		cmd.execute();		
		}

	}
	public void btnUndo() {
		//回復至先前儲存在caretaker的狀態
		for(int i = cmdList.size()-1 ; i >=0 ; i--) {		
			Command cmd = cmdList.get(i);
			cmd.undo(caretaker.getMemento(i));
			
		}	
	}
}

