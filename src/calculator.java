// calculator

import java.util.Scanner;
public class calculator {
    public static void main(String args[])
    { int a,b;
        String ch;
        System.out.print("Enter the first number:");
        Scanner src=new Scanner(System.in);
        a=src.nextInt();
        System.out.print("Enter the second number:");
        b=src.nextInt();
        src.nextLine();

        System.out.print("Enter your operation choice:");

        ch=src.nextLine();

        if(ch=="ADD")

        {
            System.out.print("Addition of numbers is ;"+(a+b));
        }
        else if(ch=="SUB")
        {
            System.out.print("Subtraction of numbers is ;"+(a-b));
        }
        else if(ch=="MUL")
        {
            System.out.print("Multiplication of numbers is ;"+(a*b));
        }
        else if(ch=="PERCENT")
        {
            System.out.print("Percentage of number is ;"+((a/a+b)*100));
        }
        else if(ch=="DIV")
        {
            System.out.print("Division of numbers is ;"+(a/b));
        }
        else
        {
            System.out.print("You enter the wrong choice..bhag jao yah se");
        }

    }
}
