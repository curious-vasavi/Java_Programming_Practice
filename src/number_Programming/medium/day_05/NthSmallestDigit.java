package number_Programming.medium.day_05;

import java.util.Scanner;

public class NthSmallestDigit
{
	public static int Smallest(int num)
	{
		int smallest = 9;
		int temp = num ;
		while(num>0)
		{
			int ld = num % 10;
			if(ld < smallest)
			{
				smallest = ld;
			}
			num = num / 10;
		}
		return smallest;
	}
	public static int removeDigit(int num , int digitToRemove)
	{
		int rev = 0;
		while(num > 0)
		{
			int ld = num % 10;
			if(ld!= digitToRemove)
			{
			rev = rev* 10+ ld;
			}
			num = num / 10;
		}
		int result = 0;
		while(rev>0)
		{
			result = result*10+(rev%10);
			rev = rev / 10;
		}
		return result;
	}
	public static int nthSmallestDigit(int num, int n)
	{
		if(num<=0)
			return -1;
		int temp = num;
		for(int k = 1;k<=n;k++)
		{
			if(temp == 0)
			{
				return -1;
			}
			int smallest = Smallest(temp);
			if(k == n)
			{
				return smallest;
			}
			temp = removeDigit(temp, smallest);
		}
		return -1;	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("Enter nth number : ");
		int n = sc.nextInt();
		int result = nthSmallestDigit(num, n);
		if(result == -1)
		{
			System.out.println("Invalid number " + n + " is not avaialable in the number");
		}
		else
		{
			System.out.println("The smallest digit in the number is " + n);
			
		}
		sc.close();
	}
}
