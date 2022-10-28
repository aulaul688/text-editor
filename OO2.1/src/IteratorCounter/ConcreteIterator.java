package IteratorCounter;

public class ConcreteIterator implements  Iterator {

// We need to have the record for the current location, therefore we need to set the value first.
    private String[] listA;
    private int index = 0;

    // We need to give the constructor an Array.
    public ConcreteIterator(ConcreteList list) {
        
        this.listA = list.getList();

    }
    
    //Override
    public boolean hasNext() {
        //Check the length of the Array exceeds or not.
        if(index >= listA.length || listA[index] == null ){
            return false;
        }
        else{
            return true;
        }
        //return listA.length>index && listA[index] != null;
    }

    //Override
    public String next() {

        //Return where the current location is, and add the new location so the next value is able to access.
        String result = listA[index];
        index++;
        return result;
    }
}
