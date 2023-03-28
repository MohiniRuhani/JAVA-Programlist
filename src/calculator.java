// calculator

import java.util.Scanner;
public class calculator {
    public static void main(String args[])
    { int a,b,ch;
        System.out.print("Enter the first number:");
        Scanner src=new Scanner(System.in);
        a=src.nextInt();
        System.out.print("Enter the second number:");
        b=src.nextInt();
        System.out.print("Enter your operation choice:");
        ch=src.nextInt();
        if(ch==1)
        {
            System.out.print("Addition of numbers is ;"+(a+b));
        }
        else if(ch==2)
        {
            System.out.print("Subtraction of numbers is ;"+(a-b));
        }
        else if(ch==3)
        {
            System.out.print("Multiplication of numbers is ;"+(a*b));
        }
        else if(ch==4)
        {
            System.out.print("Percentage of number is ;"+((a/a+b)*100));
        }
        else if(ch==4)
        {
            System.out.print("Division of numbers is ;"+(a/b));
        }
        else
        {
            System.out.print("You enter the wrong choice..bhag jao yah se");
        }

    }
}
