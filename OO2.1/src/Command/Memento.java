package Command;
import java.awt.Font;


//�Ψ��x�s�r�骬�A
public class Memento {
	private Font font;
	
	public Memento(Font fontToSave) {
		font = fontToSave;
	}
	
	public Font getSaveFont() {
		return this.font;
	}

}


