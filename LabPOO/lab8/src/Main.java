import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        HashMap<Student, LinkedList<String>> hash = new HashMap<Student, LinkedList<String>>();
        PriorityQueue<Student> pqstud = new PriorityQueue<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getAverageGrade(), o2.getAverageGrade());
            }
        });
        LinkedList<String> materii = new LinkedList<>();
        materii.add("Poo");
        materii.add("Pc");
        materii.add("SD");
        materii.add("AA");

        Student student0 = new Student(0, "Alex", "Popescu", 8.5);
        Student student1 = new Student(1, "Ion", "Radu", 10);
        Student student2 = new Student(2, "Mihai ", "Ionut", 10);
        Student student3 = new Student(3, "Dumitru", "Cristi", 6);
        Student student4 = new Student(4, "Mihai", "George", 5);
        students.add(0, student0);
        students.add(1, student1);
        students.add(2, student2);
        students.add(3, student3);
        students.add(4, student4);
        Collections.sort(students);
        System.out.println("Arraylist:");
        for (Student stud : students) {
            System.out.println(stud.toString());
        }
        System.out.println();
        System.out.println("PriorityQueue:");
        pqstud.addAll(students);
        while (!pqstud.isEmpty()) {
            Student aux = pqstud.poll();
            System.out.println(aux);
        }
        hash.put(student0, materii);
        hash.put(student1, materii);
        hash.put(student2, materii);
        hash.put(student3, materii);
        hash.put(student4, materii);
        Set set = hash.entrySet();
        System.out.println();
        System.out.println("Hashmap:");
        System.out.println();
        System.out.println(set);
        System.out.println();

    }


}
