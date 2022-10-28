package AbstractFactory;

import javax.swing.*;


public class defaultFactory implements EditorFactory{
	public MenuBar createJMenuBar() {
		return new defaultMenuBar();
	}
	public MenuItem creatJMenuItem() {
		return new defaultMenuItem();
	}
	public Menu createJMenu() {
		return new defaultMenu();
	}

}
