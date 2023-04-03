// Reverse of number
// input- 1254 _______Result-4521

import java .util.Scanner;
public class ReverseNumber {
    public static void main(String args[])
    {
        int n,r;
        System.out.print("Enter the number :");
        Scanner src=new Scanner(System.in);
        n=src.nextInt(); // n=100
        while(n>0)      // case1:100>0, yes  !! case2: 10>0,yes !! case3: 1>0,yes
        {
            r=n%10;     // r=0               !! r=10%10=0        !! r=1/%10=
            System.out.print(r); // 0        !! 0
            n=n/10;            // n=100/10=10 !!n=10/10=1
        }
    }

}
