// check whether number is positive or not
// positive if n>0 and negative if n <0 and if n =0 then it is neither positive or negative

import java.util.Scanner;
public class PositiveNegative {
    public static void main(String args[])
    {
        int n;
        System.out.print("Enter the number :");
        Scanner src=new Scanner(System.in);
        n=src.nextInt();
        if (n>0)
        {
            System.out.print("Number is positive");
        }
        else if(n<0)
        {
            System.out.print("Number is Negative");
        }
        else
        {
            System.out.print("Number is neither positive or negative");
        }
    }
}
