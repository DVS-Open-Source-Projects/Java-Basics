//Write a program to get 2 numbers from the user and multiply and divide
//and find the remainder(Modulus Operator)
import java.util.Scanner;
public class Scanner_MultiplicationDivisionandRemainder
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b;
        double c, d, e;
        System.out.println("Please enter the first number ");
        a = sc.nextInt();
        System.out.println("Please enter the second number ");
        b = sc.nextInt();
        c = a * b;
        d = a/b;
        e = a%b;
        System.out.println("The product is " + c);
        System.out.println("The quotient is " + d);
        System.out.println("The remainder is " + e);
    }
}
