package number_Programming.medium.day_04;
import java.util.*;
public class NthPrimeNumber 
{
	public static boolean prime(int n)
	{
		int count= 0;
		for(int i = 1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		return count == 2;
	}
	public static void nthPrime(int n)
	{
		int count = 0;
		for(int i = 1;true;i++)
		{
			int num = i;
			if(prime(num))
			{
				count++;
			}
			if(count == n)
			{
				System.out.println("The " + n +"th prime number is " + num);
				break;
			}
		}	
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nth number : ");
		int num = sc.nextInt();
		nthPrime(num);
		sc.close();
	}
}
