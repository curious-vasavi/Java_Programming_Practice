package number_Programming.advance.day_06;

import java.util.Scanner;

public class TwistedPrime 
{
	public static boolean checkPrime(int num)
	{
		int count = 0;
		for(int i = 1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		return count==2;
	}
	public static int reverse(int num)
	{
		int reverse = 0;
		while(num>0)
		{
			int ld = num%10;
			reverse = reverse*10+ld;
			num = num/10;
		}
		return reverse;
	}
	public static void twistedPrime(int num)
	{
		if(checkPrime(num))
		{
//			int reverse = reverse(num);
			if(checkPrime(reverse(num)))
			{
				System.out.println(num + " is a twisted Prime number");
			}
		}
		else
		{
			System.out.println( num + " is not a twisted Prime number");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		twistedPrime(num);
		sc.close();
	}
}
