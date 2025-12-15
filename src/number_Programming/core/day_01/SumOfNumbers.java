package number_Programming.core.day_01;
import java.util.*;
//2.write a program to produce sum of numbers between m and n 
public class SumOfNumbers 
{
	public static int sum(int m , int n)
	{
		int sum = 0;
		for(int i = m;i<=n;i++)
		{
			sum = sum + i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m value :");
		int m = sc.nextInt();
		System.out.println("Enter n value :");
		int n = sc.nextInt();
		System.out.println("The sum of values from range " + m + " to " + n + " is  = " + sum(m, n));
		sc.close();
	}
}
