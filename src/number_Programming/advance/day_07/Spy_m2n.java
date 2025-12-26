package number_Programming.advance.day_07;

import java.util.Scanner;
//4. WAP to print the SPY numbers present in the range of m to n. 

public class Spy_m2n
{
	public static boolean spy(int num)
	{
		int sum = 0;
		int prod = 1;
		while(num > 0)
		{	
			int ld = num % 10;
			sum = sum + ld;
			prod = prod * ld;
			num = num / 10;
		}
		return sum == prod;
	}
	public static void spyRange(int m , int n)
	{
		for(int i = m ; i<=n ;i++)
		{
			if(spy(i))
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m value : ");
		int m = sc.nextInt();
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		spyRange(m, n);
		sc.close();
	}

}
