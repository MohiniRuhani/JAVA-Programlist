//Leap Year- 366 days in a year and it will come after every four year
// Logic- 1.Century- (y%100==0 && y%4==0) 2.Year - (y%100!=0 && Y%4==0)

import java.util.Scanner;
public class LeapYear {
    public static void main(String args[])
    {
        int y;
        System.out.print("enter the year :");
        Scanner src=new Scanner(System.in);
        y=src.nextInt();
        if (y%100==0 && y%4==0 || y%100!=0 && y%4==0) // (|| is OR Symbol which mean either this or this)
        {
            System.out.print("Year is Leap Year");
        }
        else {
            System.out.print("Year is not leap year :");
        }
    }

}
