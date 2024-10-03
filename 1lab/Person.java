package Problem5;
public class Person{
    Gender gender;
    private String name;
    private int age;
    public Person(String name,int age, Gender gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public Person(Gender gender){
        this.gender=gender;
    }
    public String toString(){
        if(gender==Gender.BOY){
            return "BOY";
        }
        else if(gender==Gender.GIRL){
            return "GIRL";
        }
        else{
            return "I dont have idea who you?";
        }
    }
    public void setAge(int age){
        this.age=age;

    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }


}