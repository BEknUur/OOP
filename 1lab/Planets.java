package Problem2;
enum Planet{
    LITTLE,MEDIUM,LARGE;
}
public class Planets {
    private final double radius;
    private Planet size;
    private static int cnt=0;
    public Planets( double radius, Planet size) {

        this.radius=radius;
        this.size=size;
        cnt++;
    }

    public double getRadius() {
        return radius;
    }
    public Planet getSize() {
        return size;
    }
    public static int getCnt() {
        return cnt;
    }
    public double Area(double radius){
        return radius*radius*Math.PI;
    }
    public double Perimeter(double radius){
        return 2*Math.PI*radius;
    }

}


