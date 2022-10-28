// package IteratorCounter;

// public class ConcreteList extends CounterList {
//     private String[] listA;
//     private int index;

//     public ConcreteList(String content) {
//         this.listA = content.split("");
//         index = this.listA.length;
//     }



//     public String[] getList() {
//         return this.listA;
//     }



//     public Iterator getIterator() {
//         return new ConcreteIterator(this);
//     }
// }


package IteratorCounter;

public class ConcreteList implements CounterList {

    private String[] listA;
    private int index;

    public ConcreteList(String content) {
        this.listA = content.split("");
        index = this.listA.length;
    }


    //Override
    public String[] getList() {
        return this.listA;
    }


    //Override
    public Iterator getIterator() {
        return new ConcreteIterator(this);
    }
}

