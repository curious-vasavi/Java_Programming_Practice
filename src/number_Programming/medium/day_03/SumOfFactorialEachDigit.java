package number_Programming.medium.day_03;
import java.util.*;
public class SumOfFactorialEachDigit 
{
	public static int factorial(int num)
	{
		int fact = 1;
		for(int i = 1;i<=num;i++)
		{
			fact = fact * i;
		}
		return fact;
	}
	public static int sum(int num)
	{
		int sum = 0;
		while(num > 0)
		{
			int ld = num%10;
			sum = sum+factorial(ld);
			num = num/10;
		}
		return sum;
	}
	public static void displayResult(int num,int sum)
	{
		System.out.println("The sum of the factorial of "+ num + " is " + sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int result = sum(num);
		displayResult(num, result);
		sc.close();
	}
}
