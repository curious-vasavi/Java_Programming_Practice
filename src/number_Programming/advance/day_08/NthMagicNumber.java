package number_Programming.advance.day_08;

import java.util.Scanner;

public class NthMagicNumber 
{
	public static int sumOfNumber(int num) 
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
	public static boolean magicNumber(int num)
	{
		int result = num;
		while(result > 9)
		{
			result = sumOfNumber(result);
		}
		return result == 1;
	}
	public static void nthMagicNumber(int n)
	{
		int count = 0;
		for(int i = 1;;i++)
		{
			if(magicNumber(i))
			{
				count++;
			}
			if(count == n)
			{
				System.out.println("The " + n + "th Magic Number is " + i);
				break;
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nth value: ");
		int num = sc.nextInt();
		nthMagicNumber(num);
		sc.close();
	}
}
