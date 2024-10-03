import java.util.Scanner;
public  class  Main {
    public static void main(String[] args) {
       // 1 st task
/*
        Scanner menin = new Scanner(System.in);
        String atym=menin.nextLine();
        int san=atym.length();
        System.out.pri
        System.out.print('+'+ new String(new char[san]).replace('\0','-')+'+' + '\n'+'|'+ atym+'|'+'\n'+'+'+new String(new char[san]).replace('\0','-')+ '+');



 */


        //2 st task
/*
        Scanner san=new Scanner(System.in);
        int side=san.nextInt();
        san.nextLine();
        String method=san.nextLine();
        if(method.equals("area")){
            System.out.println(side*side);
        }
        else if(method.equals("perimeter")){
            System.out.println(side*4);
        }
        else if(method.equals("diogonal")){
            System.out.println(side*Math.sqrt(2));
        }


 */



        //3rd task
/*
        Scanner form=new Scanner(System.in);
        int san=form.nextInt();
        if(san<0){
            System.out.println("Sorry but you entered a negative number");
        }
         else if(san<30){
            System.out.println("F");
        }
        else if(san>50&&san<60){
            System.out.println("D");
        }
        else if(san>60&&san<80){
            System.out.println("C");
        }
        else if(san>80&&san<90){
            System.out.println("B");
        }
        else if(san>=90&&san<=100){
            System.out.println("A");
        }

 */





        // 4 task
/*
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int D=b*b-4*a*c;
        if(D<0){
            System.out.println("Work with complex numbers");
        }
        else{
            double  x=(-b+Math.sqrt(D))/2.0*a;
            double y=(b+Math.sqrt(D))/2.0*a;
            System.out.println(x);
            System.out.println(y);

        }

 */


        //5 task
/*
        Scanner sc=new Scanner(System.in);
        int balance=sc.nextInt();
        double procent=13.2;
        double reward=(balance*procent*30)/360;
        System.out.println(reward);

 */




        // 6task

        Scanner sc= new Scanner(System.in);
        String soz=sc.nextLine();

        String sol=new StringBuilder(soz).reverse().toString();
        if(soz.equals(sol)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }






    }
}
