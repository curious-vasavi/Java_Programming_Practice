package number_Programming.advance.day_07;

import java.util.Scanner;
//5. WAP to print the Perfect numbers present in the range of m to n. 

public class PerfectNumber_m2n 
{
	public static boolean perfect(int num)
	{
		int sum = 0;
		for(int i = 1;i<num;i++)
		{
			if(num % i == 0)
				sum = sum + i;
		}
		return sum == num;
	}
	public static void printPerfectNumber(int m , int n)
	{
		for(int i = m;i<=n;i++)
		{
			if(perfect(i))
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m value : ");
		int m = sc.nextInt();
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		printPerfectNumber(m, n);
		sc.close();
	}
}
