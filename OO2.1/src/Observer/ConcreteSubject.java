package Observer;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ConcreteSubject implements Subject{
	//�ΰ}�C�x�s�Ҧ��q�\��
	ArrayList<Observer> olist=new ArrayList<Observer>();
	
	public void add(Observer o) {
		olist.add(o);
	}
	
	public void remove(Observer o) {
		olist.remove(o);
	}
	//��s���A(�e����)//�q���q�\�̧�s���A�F

	@Override
	public void notifying(JTextArea textarea, JLabel state) {
		for(Observer oo:olist) {
			oo.update(textarea,state);
		}
	}
}
