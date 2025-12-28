package number_Programming.advance.day_08;

import java.util.Scanner;

public class NthHarshadNumber
{
	public static boolean sum(int num)
	{
		int temp = num;
		int sum = 0;
		while(num>0)
		{
			int ld = num%10;
			sum = sum+ld;
			num = num/10;
		}
		return temp % sum == 0;
	}
	public static void nthHarshadNumber(int n)
	{
		int count = 0;
		for(int i = 1; ; i++)
		{
			if(sum(i))
			{
				count++;
			}
			if(count == n)
			{
				System.out.println("The " +  n + "th Harshad number is " + i);
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nth value : ");
		int n = sc.nextInt();
		nthHarshadNumber(n);
		sc.close();
	}
}
