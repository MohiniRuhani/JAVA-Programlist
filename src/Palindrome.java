//Number is Prime Number or not
// Prime number: a number that can be divided exactly only by itself and 1
// logic- (n / n == 0 && n
//Palindrome- mean aage and peche se same
//Input-121 output - 121

import java.util.Scanner;
public class Palindrome {
    public static void main(String args[])
    { int n,s,r,p=0;
        System.out.print("Enter the number :");
        Scanner src=new Scanner(System.in);
        n=src.nextInt();
        s=n;
        while(n>0) {
            r = n % 10;
            p = (p * 10) + r;
            n = n / 10;
        }
        if(s==p)

            System.out.print("number is palindrome");

else


        System.out.print("number is not palindrome");

        }
    }

