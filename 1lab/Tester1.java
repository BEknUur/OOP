package Problem3;
import java.util.Scanner;
public class Tester1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double temp=sc.nextDouble();
        char x=sc.next().charAt(0);
        Temperature result=new Temperature(temp,x);
        if(result.getElement()=='F'){
            System.out.println("The degree of temp: "+result.toCelsius());
        }
        else if(result.getElement()=='C'){
            System.out.println("The degree of temp: "+result.toFahren());
        }else{
            System.out.println("Invalid input");
        }
    }



