package number_Programming.advance.day_06;

import java.util.Scanner;

public class MagicNumber
{
	public static int sumOfDigits(int num)
	{
		int sum = 0;
		while(num>0)
		{
			int ld = num%10;
			sum = sum+ld;
			num = num/10;
		}
		return sum;
	}
	public static boolean isMagic(int sum)
	{
		int result = sum;
		while(result>9)
		{
			result = sumOfDigits(result);
		}
		return result ==1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		if(isMagic(num))
			System.out.println(num + " is a magic number");
		else
			System.out.println(num + " is not a magic number");
		sc.close();
	}
}
