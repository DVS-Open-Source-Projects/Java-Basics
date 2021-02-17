//Print The table of any number using Scanner class and while loop
import java.util.*;
public class WhileLoop
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        int a=1,num,c;
        System.out.println("Enter a number");
        num=sc.nextInt();
        while(a<=10)
        {
            a++;
            c=a*num;
            System.out.println(c);
        }
    }
}