package number_Programming.advance.day_07;

import java.util.Scanner;
//2. WAP to print the Mega Prime numbers present in the range of m to n. 

public class MegaPrime_m2n 
{
	public static boolean checkPrime(int num)
	{
		if(num<2)
		{
			return false;
		}
		int count = 0;
		for(int i = 1;i<= num;i++)
		{
			if(num % i == 0)
			{
				count++;
			}
		}
		return count==2;
	}
	public static void checkMegaPrime(int m , int n)
	{
		for(int i = m ; i<=n;i++)
		{
			if(checkPrime(i))
			{
				int temp = i;
				boolean isDigitPrime = true;
				while(temp>0)
				{
					int ld = temp%10;
					if(!checkPrime(ld))
					{
						isDigitPrime =false;
						break;
					}
					temp = temp / 10;
				}
				if(isDigitPrime)
					System.out.println(i);
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m value : ");
		int m = sc.nextInt();
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		checkMegaPrime(m, n);
		sc.close();
	}
}
