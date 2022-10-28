package Memento;

public class Memento {
	private String state;
	private int pass;

	public void setState(String stateToSave, String pass) {
		state = stateToSave;
		this.pass = pass.hashCode();
	}

	public String getState(String pass) throws IllegalAccessException {
		int check = pass.hashCode();
		
		if(this.pass == check) {
			return state;
		}
		else {
			throw new IllegalAccessException();
		}
	}
}
