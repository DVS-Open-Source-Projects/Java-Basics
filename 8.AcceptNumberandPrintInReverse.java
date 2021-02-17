//Write a program to accept a number from user and print reverse of it.
//For Example- Enter number 123
//Output 321
import java.util.*;
public class AcceptNumberandPrintInReverse
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner (System.in);
        int a, b = 0;
        System.out.println("Enter number");
        a = sc.nextInt();
        for(;a != 0; a /= 10)
        {
            int digit = a % 10;
            b = b * 10 + digit;
        }

        System.out.println(b);
    }
}