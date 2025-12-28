package number_Programming.advance.day_08;

import java.util.Scanner;

public class NthTwistedPrimeNumber 
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
	public static int reverse(int num)
	{
		int reverse = 0;
		while(num > 0)
		{
			int ld = num % 10;
			reverse = reverse * 10 + ld;
			num = num/10;
		}
		return reverse;
	}
	public static boolean TwistedPrime(int num)
	{
		if(checkPrime(num))
		{
			int reverse = reverse(num);
			return checkPrime(reverse);
		}
		return false;
	}
	public static void nthTwistedPrime(int n)
	{
		int count = 0;
		for(int i = 2 ; ; i++)
		{
			if(TwistedPrime(i))
			{
				count++;
			}
			if(count == n)
			{
				System.out.println("The " + n + "th TwistedPrime number is " + i);
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nth value : ");
		int n = sc.nextInt();
		nthTwistedPrime(n);
		sc.close();
	}
}