package Decorator;
import java.awt.Font;
public class italic extends DecoratorStyle{
	 Componet c;

	    public italic(Componet c){
	        this.c = c;
	    }
	    public int word(){
	        return Font.ITALIC + c.word();
	    }
}
