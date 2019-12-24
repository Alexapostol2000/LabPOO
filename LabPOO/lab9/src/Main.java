import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Type, String > myMap = new MyHashMap<>(50);
        Type t1 = new Type(5, 4, 1);
        Type t2 = new Type(4,4,4);
        Type t3 = new Type(4,4,4);
        myMap.put(t1, "el");
        myMap.put(t2,"new el");
        myMap.put(t3,"cel mai new el");
        System.out.println(myMap.get(t1));
        System.out.println(myMap.get(t2));
        System.out.println(myMap.get(t3));

        for(MyHashMap<Type , String>.Entry e : myMap.getEntry() ) {
            System.out.println(e.getKey().toString() + " " + e.getValue());
        }

    }
}
