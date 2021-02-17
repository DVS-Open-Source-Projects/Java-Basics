//Write a program to except text from user and display it
import java.util.Scanner;
public class Scanner_String_Writing
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line");
        String ln = sc.nextLine();
        
        System.out.println("The line you entered is " + ln);
    }
}
