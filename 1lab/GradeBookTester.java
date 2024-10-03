package Problem4;
import Problem1.Student;
import java.util.Scanner;
public class GradeBookTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeBook gradeBook = new GradeBook();
        Course course = new Course("CS 2105 Algorithm and Data strucuture",
                "Pressure what is the pressure?\nAlgorithms makes you stronger ",
                5, "PP1,PP2 and Discreate Structure");
        System.out.println(course);
        String names[]= {"A","B","C","D","E","F"};

        for(int i = 0; i < names.length; i++) {
            System.out.print("Student " + names[i] + ": ");
            Student student = new Student("Student " + names[i], sc.nextInt());
            gradeBook.addlist(student);
        }
        sc.close();
        gradeBook.displayGradeReport();
    }
}