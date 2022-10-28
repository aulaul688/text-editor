package Flyweight;

public class ConcreteCharactor {
		private static int uniCode;
		
		ConcreteCharactor(char currentChar){		
	      uniCode = (int) currentChar;
		}
		
		public static char getChar(){
			return (char)uniCode;
		}

		public int getUniCode() {
			return uniCode;
		}

		public void setUniCode(int uniCode) {
			this.uniCode = uniCode;
		}
		
		public void draw(){
			System.out.print(uniCode);
		}
}
