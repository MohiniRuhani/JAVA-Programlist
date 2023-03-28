//Multiplication Table
// 5*1=5
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String args[]) {
        int n, mul;
        System.out.print(" Enter the number whose table you want to write ;");
        Scanner src = new Scanner(System.in);
        n = src.nextInt();
        for (int i = 1; i <= 10; i++) {
            mul = i * 1;
            System.out.println(n + "" + "*" + "" + i + "" + "=" + "" + mul);
        }
    }
}