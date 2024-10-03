package Problem5;

public class DragonTestter {
    public static void main(String[] args) {
        Droganlunch dragon = new Droganlunch();
        Person p1=new Person(Gender.BOY);
        Person p2=new Person(Gender.BOY);
        Person p3=new Person(Gender.GIRL);
        Person p4=new Person(Gender.GIRL);

        dragon.adder(p1);
        dragon.adder(p2);
        dragon.adder(p2);
        dragon.adder(p3);
        dragon.adder(p3);
        dragon.adder(p4);

        if(dragon.Willdragoneatyou()){
            System.out.println("He will eat");
        }
        else{
            System.out.println("He will not eat");
        }

    }

}

