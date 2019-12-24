import java.util.Objects;

public class Student implements Comparable<Student> {
    private long id;
    private String name;
    private String surname;
    private double averageGrade;

    public Student(long id, String name, String surname, double averageGrade) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.averageGrade = averageGrade;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getAverageGrade() {
        return this.averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return this.getId() + " " + this.getName() + " " + this.getSurname() + " " + this.getAverageGrade();
    }

    @Override
    public int compareTo(Student student) {
        if (this.getAverageGrade() < student.getAverageGrade()) {
            return -1;
        }
        if (this.getAverageGrade() > student.getAverageGrade()) {
            return 1;
        }
        if (this.getAverageGrade() == student.getAverageGrade()) {
            if (this.getName().compareTo(student.getName()) < 0) {
                return -1;
            }
            if (this.getName().compareTo(student.getName()) > 0) {
                return 1;
            }
            if (this.getName().equals(student.getName())) {
                if (this.getSurname().compareTo(student.getSurname()) < 0) {
                    return -1;
                }
                if (this.getSurname().compareTo(student.getSurname()) > 0) {
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Double.compare(student.averageGrade, averageGrade) == 0 &&
                name.equals(student.name) &&
                surname.equals(student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, averageGrade);
    }
}