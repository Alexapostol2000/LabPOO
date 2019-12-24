package task2;

public class Course {
    private String title;
    private String description;
    private Student[] studs = new Student[4];

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Student[] getStuds() {
        return studs;
    }

    public void setStuds(Student[] studs) {
        this.studs = studs;
    }

    Student[] filtreYear(int year) {
        Student[] rez = new Student[4];
        int k=0;
         for (Student stud : studs) {
             if (stud.getYear() == year) {
                 rez[k] = stud;
                 k++;
             }
         }
        return rez;
     }
}
