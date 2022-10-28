package Flyweight;

import java.util.ArrayList;

public class Factory {
	//�гy���󪺻E�X��
		private static ArrayList<ConcreteCharactor> flist=new ArrayList<ConcreteCharactor>();
		//��o������T
		private Factory() {}
		
		private static class Singleton { //�u�঳�@�Ӧ�
			private final static Factory  Instance = new Factory ();		 
			 }
		public static Factory instance() {		 
			return Singleton.Instance;		
			 }
		
		public static ConcreteCharactor getCharacter(char currentChar){
			
			for (ConcreteCharactor character : flist) {
				if(ConcreteCharactor.getChar() == currentChar){
					return character;
				}
			}
			
			ConcreteCharactor character = new ConcreteCharactor(currentChar);
			flist.add(character);
			return 	character;
        
		}
	}
