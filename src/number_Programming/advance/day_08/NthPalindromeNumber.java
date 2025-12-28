package number_Programming.advance.day_08;

import java.util.Scanner;

public class NthPalindromeNumber
{
	public static int reverse(int num)
	{
		int reverse = 0;
		while(num>0)
		{
			int ld = num % 10;
			reverse = reverse*10+ld;
			num = num/10;
		}
		return reverse;
	}
	public static boolean palindrome(int num)
	{
		int reverse = reverse(num);
		if(reverse == num)
		{
			return true;
		}
		return false;
	}
	public static void nthPalindrome(int n)
	{
		int count = 0;
		for(int i = 1; ; i++)
		{
			if(palindrome(i))
				count++;
			if(count==n)
			{
				System.out.println("The " +n+"th palindrome number is " + i);
				break;
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nth value : ");
		int n = sc.nextInt();
		nthPalindrome(n);
		sc.close();
	}
}
