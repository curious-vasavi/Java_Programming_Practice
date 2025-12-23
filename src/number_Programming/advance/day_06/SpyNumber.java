package number_Programming.advance.day_06;

import java.util.Scanner;

public class SpyNumber 
{
	public static int sum(int num)
	{
		int sum = 0;
		while(num>0)
		{
			int ld = num % 10;
			sum = sum+ld;
			num = num/10;
		}
		return sum;
		
	}
	public static int product(int num)
	{
		int product = 1;
		while(num>0)
		{
			int ld = num % 10;
			product = product * ld;
			num = num/10;
		}
		return product;
	}
	public static void spy(int num)
	{
		int sum = sum(num);
		int product = product(num);
		if(sum == product)
		{
			System.out.println(num + " is a spy number");
		}
		else
		{
			System.out.println(num + " is not a spy number");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		spy(num);
		sc.close();
	}

}
