package number_Programming.advance.day_06;

import java.util.Scanner;

public class StrongNumber 
{
	public static int factorial(int num)
	{
		int sum = 0;
		while(num>0)
		{
			int ld = num%10;
			int fact = 1;
			for(int i = 1;i<=ld;i++)
			{
				fact = fact* i;
			}
			sum = sum + fact;
			num = num/10;
		}
		return sum;
	}
	public static void strongNumber(int num)
	{
		int sumOfFactorial = factorial(num);
		if(sumOfFactorial == num)
		{
			System.out.println(num + " is a Strong number ");
		}
		else
			System.out.println(num + " is not a Strong number");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		strongNumber(num);
		sc.close();
	}
}
