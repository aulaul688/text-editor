package Command;
import java.awt.Font;


//用來儲存字體狀態
public class Memento {
	private Font font;
	
	public Memento(Font fontToSave) {
		font = fontToSave;
	}
	
	public Font getSaveFont() {
		return this.font;
	}

}


