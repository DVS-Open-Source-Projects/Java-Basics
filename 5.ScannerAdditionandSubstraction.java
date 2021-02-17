//Write a program to get 2 numbers from the user and add and substract them.
import java.util.Scanner;
public class Scanner_AdditionandSubstraction
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,  b;
        double c, d;
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt();
        c = a + b;
        d = a - b;
        System.out.println("The sum is " + c);
        System.out.println("The difference is " + d);
    }
}
