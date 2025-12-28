package number_Programming.advance.day_08;

import java.util.Scanner;

public class NthEvilNumber 
{
	public static int numToBinary(int num)
	{
		int binary = 0;
		int place = 1;
		while(num>0)
		{
			int rem = num%2;
			binary = binary+(rem*place);
			place = place * 10;
			num = num /2;
		}
		return binary;
	}
	public static boolean isEvil(int num)
	{
		int binary = numToBinary(num);
		int count = 0;
		while(binary>0)
		{
			int ld = binary % 10;
			if(ld == 1)
			{
				count++;
			}
			binary = binary/10;
		}
		return count % 2 == 0 ;
	}
	public static void nthEvilNumber(int n)
	{
		int count = 0;
		for(int i = 1; ;i++)
		{
			if(isEvil(i))
			{
				count++;
			}
			if(count == n)
			{
				System.out.println("The " + n +"th Evil number is " + i);
				break;
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nth value : ");
		int n = sc.nextInt();
		nthEvilNumber(n);
		sc.close();
	}
}
