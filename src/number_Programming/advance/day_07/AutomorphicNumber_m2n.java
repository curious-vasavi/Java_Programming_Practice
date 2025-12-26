package number_Programming.advance.day_07;

import java.util.Scanner;
//10. WAP to print the Automorphic numbers present in the range of m to n. 

public class AutomorphicNumber_m2n 
{
	public static int count(int num)
	{
		int count = 0;
		while(num>0)
		{
			num = num/10;
			count++;
		}
		return count ;
	}
	public static int placeValue(int num)
	{
		int place = 1;
		int count = count(num);
		for(int i = 1;i<=count;i++)
		{
			place = place*10;
		}
		return place;
	}
	public static void printAutomorphicNumber(int m , int n)
	{
		System.out.println("The automorphic number from the range " + m + " to " + n + " are :");
		for(int i = m ;i<=n;i++)
		{
			int place = placeValue(i);
			int square = i * i;
			int endDigit = square%place;
			if(endDigit == i)
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m value  : ");
		int m = sc.nextInt();
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		printAutomorphicNumber(m, n);
		sc.close();
	}

}
