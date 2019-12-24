package task;

import java.util.ArrayList;

public class MyImmutableArray {
    private final ArrayList<Integer> immutableArray;

    public MyImmutableArray(ArrayList<Integer> array) {
        this.immutableArray = array;
    }

    public ArrayList<Integer> getArray(){
        return new ArrayList<Integer>(this.immutableArray);
    }

    public String toString() {
        return this.immutableArray.toString();
    }
}