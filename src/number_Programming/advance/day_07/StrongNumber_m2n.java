package number_Programming.advance.day_07;

import java.util.Scanner;
//6. WAP to print the Strong numbers present in the range of m to n. 

public class StrongNumber_m2n 
{
	public static boolean strongNumber(int num)
	{
		int temp = num;
		int sum = 0;
		while(temp>0)
		{
			int ld = temp%10;
			int fact = 1;
			for(int i = 1;i<=ld;i++)
			{
				fact = fact * i;
			}
			sum = sum + fact;
			temp= temp/10;
		}
		return sum == num;
	}
	public static void printStrongNumber(int m , int n)
	{
		for(int i = m;i<=n;i++)
		{
			if(strongNumber(i))
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m value : ");
		int m = sc.nextInt();
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		printStrongNumber(m, n);
		sc.close();
	}
}
