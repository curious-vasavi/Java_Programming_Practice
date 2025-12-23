package number_Programming.advance.day_06;

import java.util.Scanner;

public class AutomorphicNumber
{
	public static int count(int num)
	{
		int count = 0;
		while(num>0)
		{
			num =num/10;
			count++;
		}
		return count;
	}
	public static int placeValue(int num)
	{
		int count = count(num);
		int place = 1;
		for(int i = 1;i<=count;i++)
		{
			place = place*10;
		}
		return place;
	}
	public static void checkAutomorphic(int num)
	{
		int place = placeValue(num);
		int square = num * num;
		int endDigit = square%place;
		if(endDigit==num)
			System.out.println(num + " is a automorphhic number");
		else
			System.out.println(num + " is not a automorphic number");
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		checkAutomorphic(num);
		sc.close();
	}
}
