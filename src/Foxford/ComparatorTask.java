package Foxford;
import java.util.Comparator;
/*Create a Student class with the following fields:

        name - string, student's name
        age - integer, student's age
        gpa - float, student's GPA
        Write a StudentGPAComparator that implements the Comparator<Student> interface. The comparator should compare two Student objects by their GPA in descending order. If the average score of two students is the same, then the objects are sorted by age in ascending order.

        Create a list of objects of class Student and populate it with several objects. Sort the list using the StudentGPAComparator and display the sorted list.*/
public class ComparatorTask {

    private String name;
    private int age;
    private double gpa;

    public ComparatorTask(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGPA() {
        return gpa;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    class StudenfGPAComparator implements Comparator<ComparatorTask>{

        @Override
        public int compare(ComparatorTask student1, ComparatorTask student2) {
            int gpaComparison = Double.compare(student2.getGPA(), student1.getGPA());
            if (gpaComparison != 0) {
                return gpaComparison;
            }
            return Integer.compare(student1.getAge(), student2.getAge());
        }
    }
}
