package number_Programming.advance.day_08;

import java.util.Scanner;

public class NthAutomorphicNumber
{
	public static int count(int num)
	{
		int count = 0;
		while(num>0)
		{
			num = num/10;
			count++;
		}
		return count;
	}
	public static int placeValue(int num)
	{
		int place = 1;
		int digit = count(num);
		for(int i = 1;i<=digit;i++)
		{
			place = place*10;
		}
		return place;
	}
	public static boolean checkAutomorphicNumber(int num)
	{
		int place = placeValue(num);
		int square = num * num;
		int endDigit=square%place;
		return endDigit == num;
	}
	public static void nthAutomorphicNumber(int n)
	{
		int count = 0;
		for(int i = 1; ; i++)
		{
			if(checkAutomorphicNumber(i))
			{
				count++;
			}
			if(count == n)
			{
				System.out.println("The " +n+"th Automorphic number is " + i);
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth value : ");
        int n = sc.nextInt();
        nthAutomorphicNumber(n);
        sc.close();
	}
}
