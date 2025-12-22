package number_Programming.medium.day_05;

import java.util.Scanner;

public class LCM 
{
	public static void lcm(int n1,int n2)
	{
		int range = 0;
		if(n1<=n2)
			range = n1;
		else
			range = n2;
		int hcf =0;
		for(int i = 1;i<=range;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				hcf = i;
			}
		}
		int lcm = (n1*n2)/hcf;
		System.out.println("The lcm of " + n1 + " and " + n2 + " is " + lcm);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  num1: ");
		int n1 = sc.nextInt();
		System.out.println("Enter  num2 : ");
		int n2 = sc.nextInt();
		lcm(n1, n2);
		sc.close();
	}

}
