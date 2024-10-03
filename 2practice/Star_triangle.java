import java.util.Scanner;
public class Star_triangle{
   private int width;
    public Star_triangle(int width){
        this.width = width;
    }
    public int getWidth(){
        return width;
    }
    public void setWidth(int width){
        this.width = width;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<width;i++){
            for(int j=0;j<width;j++){
                if(i>=j){
                    builder.append("[*]");
                }
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();

        Star_triangle star = new Star_triangle(width);
        System.out.println("The result:");
        System.out.println(star.toString());

    }
}


