// Reverse of two numbers with using third variable

import java. util.Scanner;
public class Reverse {
    public static void main(String args[])
    {
        int a, b, temp;
        System.out.print("enter the first value :");
        Scanner src=new Scanner(System.in);
        a=src.nextInt();
        System.out.print("enter the second value :");
        b=src.nextInt();
        System.out.println("value of first and second  elements before swapping is  :"+ a+" "+b);
        temp=a;
        a=b;
        b=temp;


        System.out.println("value of first and second element after swapping is  :"+ a+" "+b);

    }
}
