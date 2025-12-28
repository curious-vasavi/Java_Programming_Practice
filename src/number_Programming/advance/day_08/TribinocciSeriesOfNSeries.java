package number_Programming.advance.day_08;

import java.util.Scanner;

public class TribinocciSeriesOfNSeries 
{
	public static void tribonacciSeries(int n)
	{
		int a = 0;
		int b = 1;
		int c = 1;
		int d = 0;
		System.out.print("The " + n + " terms in tribonacci series is ");
		for(int i = 1;i<=n;i++)
		{
			System.out.print(a+" ");
		   d = a+b+c;
		   a = b;
		   b = c;
		   c = d;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		tribonacciSeries(n);
		sc.close();
	}
}
