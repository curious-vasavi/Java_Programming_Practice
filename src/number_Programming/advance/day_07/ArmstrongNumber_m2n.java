package number_Programming.advance.day_07;

import java.util.Scanner;
//8. WAP to print the Armstrong numbers present in the range of m to n. 

public class ArmstrongNumber_m2n
{
	public static int count(int num)
	{
		int count = 0;
		while(num > 0)
		{
			num = num/10;
			count++;
		}
		return count;
	}
	public static int exponential(int power,int base)
	{
		int expo = 1;
		for(int i = 1;i<=power;i++)
		{
			expo = expo * base;
		}
		return expo;
	}
	public static boolean sumOfExponential(int num)
	{
		int temp = num;
		int sum = 0;
		int power = count(num);
		while(num > 0)
		{
			int ld = num % 10;
			int expo = exponential(power, ld);
			sum = sum + expo;
			num = num/10;
		}
		return sum == temp;
	}
	public static void printInRange(int m , int n)
	{
		for(int i = m ; i<=n;i++)
		{
			if(sumOfExponential(i))
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m value  : ");
		int m = sc.nextInt();
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		printInRange(m, n);
		sc.close();
	}
}