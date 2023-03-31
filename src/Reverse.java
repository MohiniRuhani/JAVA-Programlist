// Reverse of string with using third variable

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
        temp=a;
        a=b;
        b=temp;

        System.out.println("value of first element after swapping is  :"+ a);
        System.out.print("value of second element after swapping is  :"+ b);

    }
}
