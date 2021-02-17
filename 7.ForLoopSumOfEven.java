//Write a program to print the sum of all even numbers from 1 to 10
//Output=30
 
public class ForLoop_SumOfEven
{
    public static void main()
    {
        int i, sum=0;
        for(i=1;i<=10;i++)
        {
            if(i%2==0)
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
