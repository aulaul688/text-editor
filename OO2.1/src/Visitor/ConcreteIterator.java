package Visitor;

public class ConcreteIterator extends Iterator {
    private String[] checklist;
    private int index;

    public ConcreteIterator(ConcreteCheckList list) {
        this.checklist = list.getList();
        index = 0;
    }

    public boolean hasNext() {

        return checklist.length>index && checklist[index] != null;
    }

    public String next() {
        String result = checklist[index];
        index++;
        return result;
    }
}
