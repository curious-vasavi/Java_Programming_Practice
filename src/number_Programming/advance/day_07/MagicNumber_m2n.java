package number_Programming.advance.day_07;

import java.util.Scanner;
//11. WAP to print the Magic numbers present in the range of m to n. 

public class MagicNumber_m2n 
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
	public static boolean magicNumber(int num)
	{
		int result = num;
		while(result>9)
		{
			result = sumOfDigits(result);
		}
		return result == 1;
	}
	public static void printMagicNumber(int m , int n)
	{
		for(int i = m ; i<=n ;i++)
		{
			if(magicNumber(i))
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m value : ");
		int m = sc.nextInt();
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		printMagicNumber(m, n);
		sc.close();
	}

}
