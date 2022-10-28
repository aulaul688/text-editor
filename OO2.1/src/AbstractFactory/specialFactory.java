package AbstractFactory;

public class specialFactory implements EditorFactory {
	public MenuBar createJMenuBar() {
		return new specialMenuBar();
	}
	public MenuItem creatJMenuItem() {
		return new specialMenuItem();
	}
	public Menu createJMenu() {
		return new specialMenu();
	}
}
