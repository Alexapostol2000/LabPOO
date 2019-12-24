package task1;

public class Area {
    CandyBag obj;
    int number;
    String Street;

    Area() {

    }

    Area(CandyBag obj, int number, String Street) {

        this.obj = obj;
        this.number = number;
        this.Street = Street;

    }

    public void getBirthdayCard() {

        System.out.println("Strada" + Street + "Numar" + number);
        System.out.println("LA multi ani!");
    }

    public void Parc() {
        for (int i = 0; i < obj.Box.size(); i++) {

            System.out.println(obj.Box.get(i).toString());
        }


        System.out.println("Apelare metode prin downcast folosind instanceof:");
        for (int i = 0; i < obj.Box.size(); i++) {

            if (obj.Box.get(i) instanceof Lindt)
                ((Lindt) obj.Box.get(i)).printLindtDim();

            if (obj.Box.get(i) instanceof Baravelli)
                ((Baravelli) obj.Box.get(i)).printBaravelliDim();

            if (obj.Box.get(i) instanceof ChocAmor)
                ((ChocAmor) obj.Box.get(i)).printChocAmorDim();
        }

        System.out.println("Apelare metode prin downcast fara instanceof:");
        for (int i = 0; i < obj.Box.size(); i++){
            System.out.println(obj.Box.get(i).print());

        }
    }


}
