package number_Programming.medium.day_05;

import java.util.Scanner;

public class CoPrimeNumbers 
{
	public static int gcd(int a, int b)
	{
		int gcd = 1;
		for(int i = 1 ; i<=a && i <=b;i++)
		{
			if(a%i == 0 && b % i == 0)
				gcd = i;
		}
		return gcd;
	}
	public static void coprime(int num1 , int num2)
	{
		int result = gcd(num1 , num2);
		if(result == 1)
			System.out.println("Numbers are co-prime");
		else
			System.out.println("Numbers are not co-prime");
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();
		coprime(num1,num2);
		sc.close();
	}
}
