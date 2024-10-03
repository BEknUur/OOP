package Problem5;
import java.util.Scanner;
import java.util.Vector;

public class Droganlunch{
    Vector<Person>students=new Vector<Person>();
    public void adder(Person person){
        this.students.add(person);
    }
    public boolean  Willdragoneatyou(){
        int cnt=0;
        for(Person i:students){
            if(i.gender==Gender.BOY){
                cnt++;
            }
            else if(i.gender==Gender.GIRL&&cnt>0){
                cnt--;
            }
        }
        if(cnt>0){
            return true;
        }
        else{
            return false;
        }

    }
}