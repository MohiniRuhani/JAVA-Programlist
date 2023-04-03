// count numbers of digit in a number
// input - 1245  ----result-4
import java.util.Scanner;
public class countingNumbers {
    public static void main(String args[])
    {
        int n,count=0;
        System.out.print("Enter the number:");
        Scanner src=new Scanner(System.in);
        n=src.nextInt(); // case 1: 121 !! case 2:          !! case 3:
        while(n>0)       //121>0 ,yes   !! 12>0 ,yes        !! 1>0,yes
        {
            n=n/10;     // 121/10=12    !! 12/10=1   !!  1/10
        count++;}       // count++ mean count ki aek value increase ho rhi h
                        // count=0+1=1  !! count= 1+1=2      !! count=2+1=3

        System.out.print(" Number of digit in a number is :"+ count);


    }
}
