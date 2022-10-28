package AbstractFactory;

import javax.swing.*;

public interface EditorFactory {
	public MenuBar createJMenuBar();
	public MenuItem creatJMenuItem();
	public Menu createJMenu();
}
