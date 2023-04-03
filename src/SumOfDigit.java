// sum of digit
//input- 367_______result- 3+6+7=16

import java.util.Scanner;
public class SumOfDigit {

    public static void main(String args[])
    {
        int n,r,sum=0;
        System.out.print("Enter the number :");
        Scanner src=new Scanner(System.in);
        n=src.nextInt();
        while(n>0)
        {
            r = n % 10;
            sum=sum+r;
            n=n/10;

        }
        System.out.print("Sum of digit is :"+ sum);

    }


}
