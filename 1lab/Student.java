package Problem1;

public class Student {
    private int id;
    private String name;
    private int baga;
    private static int nextId = 1;

    {
        id = nextId++;
    }

    public Student() {}

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int mark) {
        this.name = name;
        this.baga = mark;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setMark(int mark) {
        this.baga = mark;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBaga() {
        return baga;
    }

    public String toString() {
        return "\nID: " + getId()+ "\nName: "+ getName() + "\nBaga: " + getBaga();
    }
}