package Command;

// originator
public interface Command {
	
	public void execute();
	public Memento saveToMemento();
	public void undo(Memento mementoToRestore);
}
