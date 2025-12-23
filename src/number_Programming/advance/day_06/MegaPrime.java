package number_Programming.advance.day_06;

import java.util.Scanner;

public class MegaPrime
{
	public static boolean checkPrime(int num)
	{
		if(num<2)
		{
			return false;
		}
		for(int i = 1;i<= num/2;i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	public static void checkMegaPrime(int num)
	{
		if(!checkPrime(num))
		{
			System.out.println(num + " is not a mega prime");
			return;
		}
		int temp = num;
			while(temp>0)
			{
				int ld = temp % 10;
				if(!checkPrime(ld))
				{
					System.err.println(num + " is not a mega prime");
				}
				temp = temp/10;
			}	
			System.out.println(num + " is a mega prime");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		checkMegaPrime(num);
		sc.close();
	}
}
