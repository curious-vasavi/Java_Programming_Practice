package number_Programming.advance.day_08;

import java.util.Scanner;

public class FactorialSeriesNthTerm 
{
	public static int factorial(int n)
	{
		int fact = 1;
		for(int i = 1; i<=n;i++)
		{
			fact = fact*i;
			System.out.print(fact + " ");
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nth value : ");
		int num = sc.nextInt();
		factorial(num);
		sc.close();
	}
}
