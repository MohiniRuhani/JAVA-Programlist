// Reverse of two numbers without using third variable



import java.util.Scanner;
public class ReverseWithoutVariable {
    public static void main(String args[])
    {
        int a, b;
        System.out.print("enter the first value :");
        Scanner src=new Scanner(System.in);
        a=src.nextInt(); //300
        System.out.print("enter the second value :");
        b=src.nextInt(); //500
        System.out.println("Number before swapping is :"+a +" "+ b);
        a=a+b; // a=300+500=800
        b=a-b;//  b=800-500=300
        a=a-b;//  a=800-300=500

        System.out.print("Number after swapping is :"+a + " "+b );
    }
}
