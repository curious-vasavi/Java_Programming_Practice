package number_Programming.advance.day_06;

import java.util.Scanner;

public class PerfectNumber 
{
	public static int sumOfFactor(int num)
	{
		int sum = 0;
		for(int i = 1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum = sum + i;
			}
		}
		return sum;
	}
	public static void perfectNumber(int num)
	{
		int sum = sumOfFactor(num);
		if(sum == num)
		{
			System.out.println(num + " is a perfect Number");
		}
		else
			System.out.println(num + " is not a perfect number");
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		perfectNumber(num);
		sc.close();
	}
}
