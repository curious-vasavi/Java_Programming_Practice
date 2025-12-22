package number_Programming.medium.day_05;

import java.util.Scanner;

public class BinaryToDecimalRepresentation 
{
	public static void decimal(int binary)
	{
		int temp = binary;
		int decimal = 0;
		int power = 0;
		if(binary == 0)
		{
			System.out.println("The decimal form of " + 0 + " is " + 0);
		}
		else
		{
			while(binary>0)
			{
				int ld = binary%10;
				if(ld == 1)
				{
					int expo = 1;
					for(int i = 1;i<=power;i++)
					{
						expo = expo * 2;	
					}
					decimal = decimal + expo;
				}
				power++;
				binary = binary/10;
			}
			System.out.println("The number representation of " + temp + " is " + decimal);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number : ");
		int binary = sc.nextInt();
		decimal(binary);
		sc.close();
	}
}
