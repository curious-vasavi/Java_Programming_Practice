package number_Programming.advance.day_08;
import java.util.Scanner;
public class NthPrimeNumber
{
	public static boolean checkPrime(int num)
	{
		int count = 0;
		for(int i = 1;i<=num;i++)
		{
			if(num % i == 0)
			{
				count++;
			}
		}
		return count == 2;
	}
    public static void nthPrime(int n)
    {
    	int count = 0;
    	for(int i = 1;;i++)
    	{
//    		int num = i ;
    		if(checkPrime(i))
    		{
    			count++;
    		}
    		if(count == n)
    		{
    			System.out.println("The " + n + "th prime number is " + i);
    			break;
    		}
    	}
    }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nth value : ");
		int n = sc.nextInt();
		nthPrime(n);
		sc.close();
	}
}
