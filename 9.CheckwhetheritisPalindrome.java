//Write a program to accept a number from user and check whether 
//the number is palindrome number or not
//For example - Enter Number - 121
//Output - Number is Palindrome
import java.util.*;
public class CheckwhetheritisPalindrome 
{
        public static void main(String[] args) {
        int num=0, ri = 0, r, oi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        num = sc.nextInt();
        oi = num;
        while( num != 0 )
        {
            r = num % 10;
            ri = ri * 10 + r;
            num  /= 10;
        }

        if (oi == ri)
            System.out.println(oi + " is a palindrome.");
        else
            System.out.println(oi + " is not a palindrome.");
    }
}
