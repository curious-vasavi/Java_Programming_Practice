package number_Programming.advance.day_08;

import java.util.Scanner;

public class NthSunnyNumber 
{
	public static boolean perfectSquare(int num)
	{
		int i = 1;
		while(true)
		{
			int ps = i * i;
			if(ps==num)
				return true;
			if(ps>=num)
				return false;
			i++;
		}
	}
	public static boolean checkSunnyNumber(int num)
	{
		if(perfectSquare(num+1))
		{
			return true;
		}
		return false;
	}
	public static void nthSunnyNumber(int n)
	{
		int count = 0;
		for(int i = 1; ; i++)
		{
			if(checkSunnyNumber(i))
				count++;
			if(count == n)
			{
				System.out.println("The " + n + "th Sunny number is " + i);
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nth value : ");
		int n = sc.nextInt();
		nthSunnyNumber(n);
		sc.close();
	}

}
