package Memento;

public class Originator {
	private String state;
	private final String pass = "is me";

	public void set(String state) {
//		System.out.println("Originator: Setting state to " + state);
		this.state = state;
	}

	public Memento saveToMemento() {
//		System.out.println("Originator: Saving to Memento.");
		Memento memento = new Memento();
		memento.setState(state, pass);
		return memento;
	}

	public void restoreFromMemento(Memento m) {
		try {
			state = m.getState(pass);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
//		System.out.println("Originator: State after restoring from Memento: " + state);
	}
	
	public void printState() {
		System.out.println("Now state is " + this.state);
	}
}
