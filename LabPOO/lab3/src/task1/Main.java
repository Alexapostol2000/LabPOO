package task1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1/2:");
        CandyBox d1 = new CandyBox("ciocolata", "America");
        CandyBox d2 = new CandyBox("vanilie", "Italia");
        System.out.println(d1.toString());
        Lindt li1 = new Lindt("capsuni", "aici", 1, 2, 3);
        System.out.println(li1.toString());
        System.out.println(li1.height);
        ChocAmor ch1 = new ChocAmor("banane", "acolo", 4);
        System.out.println(ch1.getVolume());
        System.out.println(ch1.toString());
        System.out.println(d1.equals(d2));
        Baravelli bi1 = new Baravelli("frisca", "Olanda", 5, 10);

        System.out.println("task 3/4:");
        CandyBag A = new CandyBag();
        CandyBox c1 = new CandyBox("Capsuni", "Lidl1");
        A.Box.add(c1);
        CandyBox c2 = new CandyBox("Banane", "Lidl2");
        A.Box.add(c2);
        CandyBox c3 = new CandyBox("Portocale", "Lidl3");
        A.Box.add(c3);
        Lindt l1 = new Lindt("P1", "Profi", 2, 2, 2);
        A.Box.add(l1);
        Lindt l2 = new Lindt("P2", "Profi", 2, 2, 2);
        A.Box.add(l2);
        Baravelli b1 = new Baravelli("Gutui", "Auchan", 1, 1);
        A.Box.add(b1);
        ChocAmor ca1 = new ChocAmor("Rosii", "Mega", 4);
        A.Box.add(ca1);
        System.out.println(A.Box);
        System.out.println(A.Box.get(3).equals(A.Box.get(4)));

        System.out.println("task5:");
        bi1.printBaravelliDim();
        li1.printLindtDim();
        ch1.printChocAmorDim();


        System.out.println("task6:");
        Area Ar = new Area(A, 20, "Silistea");
        Ar.getBirthdayCard();
        Ar.Parc();


    }
}


