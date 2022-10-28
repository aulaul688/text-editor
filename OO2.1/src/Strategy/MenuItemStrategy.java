package Strategy;

import java.awt.event.*;


public interface MenuItemStrategy extends ActionListener {
	abstract void actionPerformed(ActionEvent e);
}
