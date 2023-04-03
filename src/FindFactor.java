// Factor of a number
// logic- 4--(1,2,4)
import java.util.Scanner;
public class FindFactor {
    public static void main(String args[])
    {
        int n;
        System.out.print(" Enter the number");
        Scanner src=new Scanner(System.in);
        n=src.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
            }
        }

    }
}
