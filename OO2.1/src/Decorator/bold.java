package Decorator;
import java.awt.Font;
public class bold extends DecoratorStyle{
	Componet c;
    public bold(Componet c){
        this.c = c;
    }
    public int word(){
        return Font.BOLD + c.word();
    }
}
