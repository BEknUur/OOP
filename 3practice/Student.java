public class Student extends Person {
    String program;
    int year;
    double fee;
    public Student(String name,String address,int year,double fee,String program){
        super(name,address);
        this.year=year;
        this.fee=fee;
        this.program=program;
    }
    public String getProgram(){
        return program;
    }
    public void setProgram(String program){
        this.program=program;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }
    public double getFee(){
        return fee;
    }
    public void setFee(double fee){
        this.fee=fee;
    }
    public String toString() {
        return "Student[" + super.toString() + ", program=" + program + ", year=" + year + ", fee=" + fee + "]";
    }
}
