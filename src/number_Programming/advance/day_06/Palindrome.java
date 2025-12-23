package number_Programming.advance.day_06;

import java.util.Scanner;

public class Palindrome 
{
	public static int reverse(int num)
	{
		int reverse = 0;
		while(num>0)
		{
			int ld = num%10;
			reverse = reverse * 10 + ld;
			num = num/10;
		}
		return reverse;
	}
	public static void palindrome(int num)
	{
		if(num == reverse(num))
		{
			System.out.println(num + " is a palindrome number");
		}
		else
		{
			System.out.println(num + " is not a palindrome number");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		palindrome(num);
		sc.close();
	}
}
