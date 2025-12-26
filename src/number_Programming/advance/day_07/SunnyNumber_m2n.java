package number_Programming.advance.day_07;

import java.util.Scanner;
//9. WAP to print the Sunny numbers present in the range of m to n. 

public class SunnyNumber_m2n 
{
	public static boolean perfectSquare(int num)
	{
		int i = 1;
		while(true)
		{
		int ps = i*i;
		if(ps==num)
			return true;
		if(ps>=num)
			return false;
		i++;
		}
	}
	
	public static void sunnyNumberInRange(int m,int n)
	{
		for(int i = m;i<=n;i++)
		{
			if(perfectSquare(i+1))
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m value : ");
		int m = sc.nextInt();
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		sunnyNumberInRange(m, n);
		sc.close();
	}
}
