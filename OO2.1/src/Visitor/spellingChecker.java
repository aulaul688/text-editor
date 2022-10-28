package Visitor;

public class spellingChecker implements Checker {

    private String word;
    public spellingChecker(String inputWord){
        this.word = inputWord;
    }
    @Override
    public boolean action(EnglishDictionary el1) throws Exception {
        String word = this.word;
        return el1.action(word);
    }
}
