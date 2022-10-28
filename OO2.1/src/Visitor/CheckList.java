package Visitor;

public abstract class CheckList {
    public abstract String[] getList();

    public abstract ConcreteIterator getIterator();

    public abstract void addItem(String item);
}
