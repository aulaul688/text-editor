package Visitor;

public abstract class Dict {
    public abstract boolean accept(Checker checker) throws Exception;
    public abstract boolean action(String word) throws Exception;
}
