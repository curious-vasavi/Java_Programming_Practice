package number_Programming.advance.day_07;

import java.util.Scanner;
//12. WAP to print the Tech numbers present in the range of m to n. 

public class TechNumber_m2n 
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
		for(int i = 1;i<=count/2;i++)
		{
			place = place*10;
		}
		return place;
	}
	public static boolean techNubmer(int num)
	{
		int countN=count(num);
		if(countN%2==0)
		{
			int square = num * num;
			int countS = count(square);
			if(countS%2==0)
			{
				int place = placeValue(countS);
				int secondHalf = square%place;
				int firstHalf = square/place;
				int endDigit = firstHalf + secondHalf;
				if(num == endDigit)
//					System.out.println("It's tech number");
					return true;
				else
//					System.out.println("It's not tech number");
					return false;
			}
			else
//				System.out.println("It's not tech number");
				return false;
		}
		else
//			System.out.println("It's not tech number");
			return false;
	}
	public static void printTechInRange(int m , int n)
	{
		for(int i = m ; i<=n;i++)
		{
			if(techNubmer(i))
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m value : ");
		int m = sc.nextInt();
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		printTechInRange(m, n);
		sc.close();
	}
}
