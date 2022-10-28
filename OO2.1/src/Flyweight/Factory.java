package Flyweight;

import java.util.ArrayList;

public class Factory {
	//創造元件的聚合池
		private static ArrayList<ConcreteCharactor> flist=new ArrayList<ConcreteCharactor>();
		//獲得內部資訊
		private Factory() {}
		
		private static class Singleton { //只能有一個池
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
