package task1;

import task1.complex;

public class Main {
    public static void main(String[] args) {
        complex n1 = new complex(2, 3);
        complex n2 = new complex(3, 6);
        System.out.println("primul numar complex este");
        n1.shownumber(n1);
        System.out.println("al doilea numar complex este");
        n2.shownumber(n2);
        System.out.println("suma lor este");
        n1.addWithComplex(n2);
        n1.shownumber(n1);
    }
}
