package number_Programming.advance.day_06;

import java.util.Scanner;

public class HarshadNumber 
{
	public static int sumOfDigits(int num)
	{
		int sum = 0;
		while(num>0)
		{
			int ld = num % 10;
			sum = sum + ld;
			num = num/10;
		}
		return sum;
	}
	public static void checkHarshadNumber(int num)
	{
		int sum = sumOfDigits(num);
		if(num % sum == 0)
			System.out.println(num + " is a Harshad Number");
		else
			System.out.println(num + " is not a Harshad Number");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		checkHarshadNumber(num);
		sc.close();
	}
}
