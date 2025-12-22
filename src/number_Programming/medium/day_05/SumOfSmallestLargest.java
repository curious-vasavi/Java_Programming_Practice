package number_Programming.medium.day_05;

import java.util.Scanner;

public class SumOfSmallestLargest
{
	public static int largest(int num)
	{
		int largest = 0;
		while(num > 0)
		{
			int ld = num % 10;
			if(ld>largest)
			{
				largest = ld;
			}
			num = num/10;
		}
		System.out.println("The largest digit in the number is " + largest);
		return largest;
	}
	public static int smallest(int num)
	{
		int smallest = 9;
		while(num > 0)
		{
			int ld = num % 10;
			if(ld<smallest)
			{
				smallest = ld;
			}
			num = num/10;
		}
		System.out.println("The smallest digit in the number is " + smallest);
		return smallest;
	}
	public static void sum(int num) 
	{
		int sum = largest(num)+smallest(num);
		System.out.println("The sum of the largest digit and the smallest in the number is " + sum);
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		sum(num);
		sc.close();
	}
}
