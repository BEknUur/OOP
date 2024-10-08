

public class Animal {
    private String name;
  private  int age;
   private String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }


    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }


    public String toUppercase() {
        if (name != null) {
            return name.toUpperCase();
        } else {
            return "The name doesn't exist";
        }
    }


    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

}
