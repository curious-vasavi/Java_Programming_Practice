package number_Programming.advance.day_06;

import java.util.Scanner;

public class NeonNumber 
{
	public static int squreOfDigits(int num)
	{
		int square = num * num;
		int sum = 0;
		while(square>0)
		{
			int ld = square%10;
			sum = sum + ld;
			square = square/10;
		}
		return sum;
	}
	public static void neonNumber(int num)
	{
		int square = squreOfDigits(num);
		if(square == num) {
			System.out.println(num + " is a neon number");
		}
		else
			System.out.println(num + " is not a neon number");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		neonNumber(num);
		sc.close();
	}

}
