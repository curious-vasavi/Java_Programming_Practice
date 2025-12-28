package number_Programming.advance.day_08;

import java.util.Scanner;

public class LucasSeries 
{

	public static void lucas(int n)
	{
		int a = 2;
		int b = 1;
		int c = 0;
		System.out.println("First " +n + "terms in lucas series");
		for(int i = 1;i<=n;i++)
		{
			System.out.println(a);
			c = a+b;
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		lucas(n);
		sc.close();
	}

}
