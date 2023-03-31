// convert character into uppercase and lowercase
//A-a
//a-A
import java.util.Scanner;

public class StringUpperLower {
    public static void main(String args[])
    {
        char ch;
        System.out.print("Enter the character :");
        Scanner src=new Scanner(System.in);
        ch=src.next().charAt(0);
        if(ch>='A'&& ch<='Z')
        {
            System.out.println(Character.toLowerCase(ch));
        }
        else
        {
            System.out.print(Character.toUpperCase(ch));
        }


    }

}
