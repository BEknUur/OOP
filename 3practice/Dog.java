
public class Dog extends Animal {
    String owner;
    int price;

    public Dog(String name, int age, String color) {
        super(name, age, color);


    }


    public Dog(String owner, int price) {
        super();
        this.owner = owner;
        this.price = price;
    }






    public String toUppercase(String predlog) {
        return predlog + " " + super.toUppercase();
    }

    public String getOwner() {
        return owner;
    }

    public int getPrice() {
        return price;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String toString() {
        return "Dog{" +
                "name='" +getName() + '\'' +
                ", age=" + getAge() +
                ", color='" + getColor() + '\'' +
                ", owner='" + owner + '\'' +
                ", price=" + price +
                '}';
    }


    public static void main(String[] args) {

        Dog soz = new Dog("Dauren", 20);
        System.out.println(soz.getOwner());
        System.out.println(soz.getPrice());

        Dog soz2 = new Dog("Aktos", 15, "red");
        System.out.println(soz2.getAge());
        System.out.println(soz2.getColor());
        System.out.println(soz2.toUppercase("The name of the dog is:"));

        System.out.println(soz2.toString());
    }
}
