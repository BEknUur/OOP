package Problem2;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        sc.nextLine();
        String soz = sc.nextLine().toUpperCase();
        Planet size=null;
        if(soz.equals("LITTLE")){
            size=Planet.LITTLE;
        }
        else if(soz.equals("LARGE")){
            size=Planet.LARGE;
        }
        else if(soz.equals("MEDIUM")){
            size=Planet.MEDIUM;
        }
        if(size!=null){
            Planets plant=new Planets(radius,size);
            System.out.println("The size of radius"+plant.getRadius());
            System.out.println("The size of size"+plant.getSize());
            double san=plant.Area(radius);
            System.out.println("The area of san"+san);
            double perimtiter=plant.Perimeter(radius);
            System.out.println("The perimeter of san"+perimtiter);
        }


        }


    }

