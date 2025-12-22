package number_Programming.medium.day_05;

import java.util.Scanner;

public class NthLargestDigit 
{
	public static int largest(int num)
	{
		int large = 0;
		int temp = num;
		while(num > 0)
		{
			int ld = num % 10;
			if(ld > large)
			{
				large = ld;
			}
			num = num/10;
		}
		return large;
	}
	public static int removeDigit(int num, int digitToRemove)
	{
		int rev = 0;
		while(num > 0)
		{
			int ld = num % 10;
			if(ld != digitToRemove)
			{
				rev = rev * 10 + ld;
			}
			num = num/10;
		}
		int result = 0;
		while(rev>0)
		{
			int d = rev%10;
			result = result * 10+d;
			rev = rev/10;
		}
		return result;	
	}
	public static int nthLargestNumber(int num,int n)
	{
		if(n<=0)
			return -1;
		int temp = num;
		for(int k =1;k<=n;k++)
		{
			if(temp == 0)
			{
				return -1;
			}
			int largest = largest(temp);
			if(k == n)
			{
				return largest;
			}
			temp = removeDigit(temp,largest);
		}
		return -1;	
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("Enter nth number: ");
		int nth = sc.nextInt();
		int result = nthLargestNumber(num, nth);
		if(result == -1)
		{
			System.out.println("Invalid number " + nth+ "th largest digit in "+num);
		}
		else
		{
			System.out.println(nth + "th largest digit in "+num+ " is " + result);
		}
		sc.close();
	}

}
