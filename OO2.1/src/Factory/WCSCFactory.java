package Factory;


public class WCSCFactory extends DialogFactory {
	public  MessageDialog createDialog(String type, String t) {
		if(type == "Word Count") {
			return new WordCount(t);
		}
		else if(type == "Spell Cheeck") {
			return new SpellCheck(t);
		}
		else
			return null;
		
	}
	
}
