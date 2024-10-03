package Problem4;
import  Problem1.Student;

import java.util.ArrayList;

public class GradeBook {

    public double average;
    public int cnt = 0;
    ArrayList<Student> listOfStudents = new ArrayList<Student>();

    public void addlist(Student first) {
        listOfStudents.add(first);
        cnt++;
    }

    public void displayGradeReport() {
        determineClassAverage();
        determineClassMin();
        determineClassMax();
        gradesDistribution();
    }

    public void determineClassAverage() {
        average = 0;
        for (Student s : listOfStudents)
            average += s.getBaga();
        System.out.print("Class average is " + average / listOfStudents.size());
    }


    public void gradesDistribution() {
        System.out.print("00-09: ");
        for (int i = 0; i < listOfStudents.size(); i++)
            if (listOfStudents.get(i).getBaga() >= 0 && listOfStudents.get(i).getBaga() < 10)
                System.out.print("*");
        System.out.println();
        System.out.print("10-19: ");
        for (int i = 0; i < listOfStudents.size(); i++)
            if (listOfStudents.get(i).getBaga() >= 10 && listOfStudents.get(i).getBaga() < 20)
                System.out.print("*");
        System.out.println();
        System.out.print("20-29: ");
        for (int i = 0; i < listOfStudents.size(); i++)
            if (listOfStudents.get(i).getBaga() >= 20 && listOfStudents.get(i).getBaga() < 30)
                System.out.print("*");
        System.out.println();
        System.out.print("30-39: ");
        for (int i = 0; i < listOfStudents.size(); i++)
            if (listOfStudents.get(i).getBaga() >= 30 && listOfStudents.get(i).getBaga() < 40)
                System.out.print("*");
        System.out.println();
        System.out.print("40-49: ");
        for (int i = 0; i < listOfStudents.size(); i++)
            if (listOfStudents.get(i).getBaga() >= 40 && listOfStudents.get(i).getBaga() < 50)
                System.out.print("*");
        System.out.println();
        System.out.print("50-59: ");
        for (int i = 0; i < listOfStudents.size(); i++)
            if (listOfStudents.get(i).getBaga() >= 50 && listOfStudents.get(i).getBaga() < 60)
                System.out.print("*");
        System.out.println();
        System.out.print("60-69: ");
        for (int i = 0; i < listOfStudents.size(); i++)
            if (listOfStudents.get(i).getBaga() >= 60 && listOfStudents.get(i).getBaga() < 70)
                System.out.print("*");
        System.out.println();
        System.out.print("70-79: ");
        for (int i = 0; i < listOfStudents.size(); i++)
            if (listOfStudents.get(i).getBaga() >= 70 && listOfStudents.get(i).getBaga() < 80)
                System.out.print("*");
        System.out.println();
        System.out.print("80-89: ");
        for (int i = 0; i < listOfStudents.size(); i++)
            if (listOfStudents.get(i).getBaga() >= 80 && listOfStudents.get(i).getBaga() < 90)
                System.out.print("*");
        System.out.println();
        System.out.print("90-99: ");
        for (int i = 0; i < listOfStudents.size(); i++)
            if (listOfStudents.get(i).getBaga() >= 90 && listOfStudents.get(i).getBaga() < 100)
                System.out.print("*");
        System.out.println();
        System.out.print("100: ");
        for (int i = 0; i < listOfStudents.size(); i++)
            if (listOfStudents.get(i).getBaga() == 100)
                System.out.print("*");
        System.out.println();
    }

    public void determineClassMin() {
        int minmark = listOfStudents.get(0).getBaga();
        int index = 0;
        for (int i = 1; i < listOfStudents.size(); i++) {
            if (listOfStudents.get(i).getBaga() < minmark) {
                minmark = listOfStudents.get(i).getBaga();
                index = i;
            }
        }
        System.out.println(
                "\nLowest grade is " + minmark + " (" + listOfStudents.get(index).getName() +
                        ", id: " + listOfStudents.get(index).getId() + ")");

    }

    public void determineClassMax() {
        int maxmark = listOfStudents.get(0).getBaga();
        int index = 0;
        for (int i = 1; i < listOfStudents.size(); i++) {
            if (listOfStudents.get(i).getBaga() > maxmark) {
                maxmark = listOfStudents.get(i).getBaga();
                index = i;
            }
        }
        System.out.println(
                "Highest grade is " + maxmark + " (" + listOfStudents.get(index).getName() +
                        ", id: " + listOfStudents.get(index).getId() + ")");
    }

    public String toString() {
        return "\nAverage = " + average + "\nCount = " + cnt;
    }

}


