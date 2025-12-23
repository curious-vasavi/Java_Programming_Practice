package number_Programming.advance.day_06;

import java.util.Scanner;

public class TechNumber
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
	public static int placeValue(int count)
	{
		int place = 1;
		for(int i = 1 ;i<=count/2;i++)
		{
			place = place*10;
		}
		return place;
	}
	public static void checkTechNumber(int num)
	{
		int countN = count(num);
		if(countN%2 == 0)
		{
			int square = num * num ;
			int countS = count(square);
			if(countS % 2 == 0)
			{
				int place = placeValue(countS);
				int secondHalf = square%place;
				int firstHalf = square/place;
				int sum = firstHalf+secondHalf;
				if(sum == num)
					System.out.println(num + " is a Tech Number");
				else
					System.out.println(num + " is not a Tech Number");
			}
			else
				System.out.println(num + " is not a Tech Number");
		}
		else
			System.out.println(num + " is not a Tech Number");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		checkTechNumber(num);
		sc.close();
	}
}
