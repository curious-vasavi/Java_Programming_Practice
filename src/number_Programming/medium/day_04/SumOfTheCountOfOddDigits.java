package number_Programming.medium.day_04;
import java.util.*;
public class SumOfTheCountOfOddDigits
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
	public static int exponential(int base,int power)
	{
		int expo = 1;
		for(int i = 1;i<=power;i++)
		{
			expo = expo * base;
		}
		return expo;
	}
	public static void SumOfExpoOfOddDigit(int num)
	{
		int power = count(num);
		int sum = 0;
		while(num > 0)
		{
			int ld = num % 10;
			if(ld%2 != 0)
			{
				int expo = exponential(ld, power);
				sum = sum + expo;
			}
			num = num / 10;
		}
		System.out.println("The sum Of exponential of odd digits is " + sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		SumOfExpoOfOddDigit(num);
		sc.close();
	}
}
