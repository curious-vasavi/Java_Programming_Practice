package number_Programming.medium.day_04;
import java.util.*;
public class SumOfExponentialOfEachDigit 
{
	public static int count(int num)
	{
		int count = 0;
		while(num > 0)
		{
			num = num / 10;
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
	public static void sumOfExponential(int num)
	{
		int power = count(num);
		int sum=0;
		while(num > 0)
		{
			int ld = num % 10;
			int expo = exponential(power, ld);
			sum = sum + expo;
			num = num/10;
		}
		System.out.println("The sum of Exponential is " + sum);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		sumOfExponential(num);
		sc.close();
	}
}
