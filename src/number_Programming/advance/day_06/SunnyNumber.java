package number_Programming.advance.day_06;

import java.util.Scanner;

public class SunnyNumber 
{
	public static boolean perfectSqure(int num)
	{
		int i = 1;
		while(true)
		{
			int ps = i*i;
			if(ps == num)
				return true;
			if(ps>num)
				return false;
			i++;
		}
	}
	public static void sunnyNumber(int num)
	{
		if(perfectSqure(num + 1))
			System.out.println(num + " is a sunny number");
		else
			System.out.println(num + " is not a sunny number");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		sunnyNumber(num);
		sc.close();
	}

}
