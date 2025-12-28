package number_Programming.advance.day_08;

import java.util.Scanner;

public class HCFOfThreeNumbers
{
	public static int hcf(int n1,int n2,int n3)
	{
		int range = 0;
		if(n1<=n2 && n1<=n3)
			range = n1;
		else if(n2<n3)
			range = n2;
		else
			range = n3;
		int hcf = 0;
		for(int i = 1;i<=range;i++)
		{
			if(n1 % i == 0 && n2 % i == 0 && n3 % i ==0)
			{
				hcf = i;
			}
		}
		System.out.println("The highest common factor of " + n1 + ", " + n2 + " and " + n3 + " is " + hcf);
		return hcf;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1 value : ");
		int n1 = sc.nextInt();
		System.out.println("Enter n2 value : ");
		int n2 =sc.nextInt();
		System.out.println("Enter n3 value : ");
		int n3 = sc.nextInt();
		hcf(n1, n2, n3);
		sc.close();
	}
}
