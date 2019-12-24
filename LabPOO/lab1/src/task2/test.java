package task2;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Course curs = new Course();
        curs.setTitle("POO");
        curs.setDescription("\"Programare orientata pe obiecte\"");
        for (int i = 0; i < 4; i++)
            curs.getStuds()[i] = new Student();

        curs.getStuds()[0].setName("alex");
        curs.getStuds()[0].setYear(1999);
        curs.getStuds()[1].setName("alex");
        curs.getStuds()[1].setYear(1999);
        curs.getStuds()[2].setName("gigel");
        curs.getStuds()[2].setYear(2000);
        curs.getStuds()[3].setName("gogu");
        curs.getStuds()[3].setYear(1998);

        System.out.println(Arrays.toString(curs.filtreYear(1999)));
        System.out.println(curs.getStuds()[0].equals(curs.getStuds()[1]));

    }
}
