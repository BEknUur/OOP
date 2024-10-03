import java.util.Scanner;
public class Student {
    private String name;
    private int id;
    private int year_of_study;
   public Student (String name,int id,int year_of_study){
        this.name=name;
        this.id=id;
        this.year_of_study=year_of_study;

    }
    public String getName(){
       return name;
    }
    public int getId(){
       return id;
    }
    public int getYearOfStudy(){
       return year_of_study;
    }
    public void increase_of_study(){
       year_of_study+=4;
    }
    public void set_name(String name){
       this.name=name;
    }
    public void set_id(int id){
       this.id=id;
    }
    public void set_year_of_study(int year_of_study){
       this.year_of_study=year_of_study;
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String name=sc.nextLine();
       int id=sc.nextInt();
       int year_of_study=sc.nextInt();

       Student first=new Student(name,id,year_of_study);
       first.increase_of_study();
       System.out.println("Student name: "+first.getName());
       System.out.println("Student id: "+first.getId());
       System.out.println("Student year of graduating: "+first.getYearOfStudy());

    }

}

