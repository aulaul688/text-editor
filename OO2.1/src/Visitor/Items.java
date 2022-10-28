package Visitor;

import java.util.ArrayList;

import javax.swing.JTextArea;

import AbstractFactory.Menu;
import AbstractFactory.MenuItem;

//Element
public abstract class Items {

	public abstract void accept(AppearanceVisitor visitor);
}
