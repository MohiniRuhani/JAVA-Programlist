// Reverse  of string with the using third variable
// a=mohini,b=ankur ___________Result a=ankur,b=mohini
import java.util.Scanner;
public class StringSwapping {
    public static void main(String args[])
    {
        String first,sec,temp;
        System.out.print("Enter the first string :");
        Scanner src=new Scanner(System.in);
        first=src.nextLine();
        System.out.print("Enter the second string :");
        sec=src.nextLine();
        System.out.println("first and second string before swapping :"+ first+" "+sec);
        temp=first;
        first=sec;
        sec=temp;

        System.out.println("first and second string after swapping :"+ first+" "+sec);



    }
}
