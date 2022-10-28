package Visitor;

public class ConcreteCheckList extends CheckList {
    private String[] checklist;
    private int index;

    public ConcreteCheckList(String content) {
        this.checklist = content.split("\\.|,| |\\?|!|\\n");
        index = this.checklist.length;
    }

    public void addItem(String item) {
        this.checklist[index] = item;
        index++;
    }

    public String[] getList() {
        return this.checklist;
    }
    
    public ConcreteIterator getIterator() {
        return new ConcreteIterator(this);
    }
}
