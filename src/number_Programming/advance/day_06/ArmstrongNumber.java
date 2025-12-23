package number_Programming.advance.day_06;

import java.util.Scanner;

public class ArmstrongNumber 
{
	public static int count(int num)
	{
		int count = 0;
		while(num>0)
		{
			num = num/10;
			count++;
		}
		return count;
	}
	public static int exponential(int base,int power)
	{
		int expo = 1;
		for(int i = 1;i<=power;i++)
		{
			expo = expo * base;
		}
		return expo;
		
	}
	public static int sumOfexponential(int num)
	{
		int power = count(num);
		int sum = 0;
		while(num>0)
		{
			int ld = num%10;
			int expo = exponential(ld, power);
			sum = sum + expo;
			num = num/10;
		}
		return sum;
	}
	public static void checkArmstrong(int num)
	{
		int sum = sumOfexponential(num);
		if(sum == num)
			System.out.println(num + " is a Armstrong number ");
		else
			System.out.println(num + " is not a Armstrong number");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		checkArmstrong(num);
		sc.close();
	}
}
