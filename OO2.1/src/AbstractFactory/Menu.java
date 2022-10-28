package AbstractFactory;


import javax.swing.*;

public abstract class Menu extends JMenu{
	 public abstract void setContent(String text);
	 public abstract void addMenuItem(MenuItem item);
	 
}
