package task;

import java.util.ArrayList;

public class Main {
    public static void main(final String[] args) {
        //task1
        PasswordMaker password = PasswordMaker.getInstance();
        System.out.println(PasswordMaker.getInstance().GetPassword());

        //task2
        password = PasswordMaker.getInstance();
        System.out.println(password.getCount());

        //task3
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(34);

        MyImmutableArray immutable = new MyImmutableArray(list);
        System.out.println(immutable);
        ArrayList <Integer> list2 = immutable.getArray();
        list2.set(0, 100);
        System.out.println(immutable);
        System.out.println(list2);
    }
}
