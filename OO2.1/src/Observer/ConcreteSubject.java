package Observer;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ConcreteSubject implements Subject{
	//用陣列儲存所有訂閱者
	ArrayList<Observer> olist=new ArrayList<Observer>();
	
	public void add(Observer o) {
		olist.add(o);
	}
	
	public void remove(Observer o) {
		olist.remove(o);
	}
	//更新狀態(送報紙)//通知訂閱者更新狀態了

	@Override
	public void notifying(JTextArea textarea, JLabel state) {
		for(Observer oo:olist) {
			oo.update(textarea,state);
		}
	}
}
