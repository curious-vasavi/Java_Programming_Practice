package number_Programming.medium.day_04;

import java.util.Scanner;

public class LargestDigit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		largestDigit(num);
		sc.close();

	}
	public static void largestDigit(int num)
	{
		int large = 0;
		while(num > 0)
		{
			int lastDigit = num % 10;
			if(lastDigit > large)
			{
				large = lastDigit;
			}
			num = num / 10;
		}
		System.out.println("The largest digit is : " + large);
	}
}
