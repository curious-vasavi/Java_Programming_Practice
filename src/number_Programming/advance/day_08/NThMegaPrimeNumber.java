package number_Programming.advance.day_08;

import java.util.Scanner;

public class NThMegaPrimeNumber 
{
	public static boolean checkPrime(int num)
	{
		if(num<2)
			return false;
		int count = 0;
		for(int i = 1;i<=num;i++)
		{
			if(num%i==0)
			count++;
		}
		return count == 2;
	}
	public static boolean megaPrime(int num)
	{
		if(!checkPrime(num))
		{
			return false;
		}
		
			while(num>0)
			{
				int ld = num % 10;
				if(!checkPrime(ld))
				{
					return false;
				}
				num = num/10;
			}
		return true;
	}
	public static void nthMegaPrime(int n)
	{
		int count = 0;
		for(int i = 2; ;i++)
		{
			if(megaPrime(i))
			{
				count++;
			}
			if(count == n)
			{
				System.out.println("The "+ n +"th MegaPrime number is " + i);
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nth value : ");
		int n = sc.nextInt();
		nthMegaPrime(n);
		sc.close();
	}
}
