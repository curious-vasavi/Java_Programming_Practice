package number_Programming.advance.day_06;

import java.util.Scanner;

public class EvilNumber 
{
	public static int numToBinary(int num)
	{
		int place = 1;
		int binary = 0;
		while(binary >0)
		{
			int rem = num%2;
		    binary = binary + (rem * place);
			place = place * 10;
			num = num / 2;
		}
		return binary;
	}
	public static void evilNumber(int num)
	{
		int binary = numToBinary(num);
		int count = 0;
		if(binary>0)
		{
			int ld = binary%10;
			if(ld == 1)
				count++;
		}
		if(count%2==0)
			System.out.println(num + " is a evil number");
		else
			System.out.println(num + " is not a evil number");	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		evilNumber(num);
		sc.close();
	}
}
