// find average of n numbers:
//
import java.util.Scanner;
public class Average {
    public static void main(String args[]) {
        int n,sum=0;
        double average;
        System.out.print("Enter the number of elements in array: ");
        Scanner src = new Scanner(System.in);
        n = src.nextInt();
        int a[] = new int[n];
        System.out.print("Enter the elements in array: ");
        for (int i = 0; i < n; i++) {
            a[i] = src.nextInt();
            sum=a[i]+sum;


        }
        average=sum/n;

System.out.print(average+" ");

        }
    }
