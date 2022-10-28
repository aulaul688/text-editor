package Command;
import java.util.ArrayList;

public class Caretaker {
	private ArrayList<Memento> saveFonts = new ArrayList<Memento>();
	
	public void addMemento(Memento m) {
		saveFonts.add(m);
	}
	
	public Memento getMemento(int findex) {
		return saveFonts.get(findex);
	}
	
	public int getMementoSize() {
		return saveFonts.size();
	}
}

