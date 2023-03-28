// count numbers of digit in a number
import java.util.Scanner;
public class countingNumbers {
    public static void main(String args[])
    {
        int n,count=0;
        System.out.print("Enter the number:");
        Scanner src=new Scanner(System.in);
        n=src.nextInt();
        while(n>0)
        {
            n=n/10;
        count++;}

        System.out.print(" Number of digit in a number is :"+ count);


    }
}
