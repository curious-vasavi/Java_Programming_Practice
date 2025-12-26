package number_Programming.advance.day_07;

import java.util.Scanner;
//1. WAP to print the Twisted Prime numbers present in the range of m to n. 

public class TwistedPrime_m2n
{
	public static boolean checkPrime(int num)
	{
		int count = 0;
		for(int i = 1;i<=num;i++)
		{
			if(num%i==0)
				count++;
		}
		return count ==2;
	}
	public static int reverse(int num)
	{
		int rev = 0;
		while(num > 0)
		{
			int ld = num % 10;
			rev = (rev * 10) + ld;
			num = num / 10;
		}
		return rev ;
	}
	public static boolean checkTwistedPrime(int num)
	{
		int reverse = reverse(num);
		if(checkPrime(num))
		{
			if(checkPrime(reverse))
			{
				return true;
			}
			else
				return false;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m value : ");
		int m = sc.nextInt();
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		System.out.println("The twisted prime numbers in the range " + m + " to " + n + " are ");
		for(int i = m;i<=n;i++)
		{
			if(checkTwistedPrime(i))
			{
				System.out.println(i);
			}		
		}
		sc.close();
	}
}
