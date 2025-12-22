package number_Programming.medium.day_05;

import java.util.Scanner;

public class GCDOrHCF 
{
	public static void hcf(int n1,int n2)
	{
		int range = 0;
		if(n1<=n2)
			range = n1;
		else
			range = n2;
		int hcf =0;
		for(int i = range ;i>=1;i--)
		{
			if(n1 %i==0 && n2 % i ==0)
			{
				hcf =i;
				break;
			}
		}
		System.out.println("The highest common factor of " + n1 + " and " + n2 + " is " + hcf);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int  n1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int n2 = sc.nextInt();
		hcf(n1, n2);
		sc.close();
	}
}
