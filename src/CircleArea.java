// area of circle
//formula is pie*r*r
import java.util.Scanner;
public class CircleArea {
    public static void main(String args[]) {
        double p = 3.14;
        int r;

        System.out.print("Enter the radius:");
        Scanner src = new Scanner(System.in);
        r = src.nextInt();

        System.out.print("Area of circle is:" + (p * r * r));

    }
}

