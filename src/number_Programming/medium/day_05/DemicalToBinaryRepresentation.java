package number_Programming.medium.day_05;

import java.util.Scanner;

public class DemicalToBinaryRepresentation 
{
	public static void binaray(int num)
	{
		int temp = num;
		int binary = 0;
		int place = 1;
		while(num>0)
		{
			int rem = num%2;
			binary = binary+(rem*place);
			place = place * 10;
			num = num/2;
		}
		System.out.println("The binary form of " + temp + " is "+ binary);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		binaray(num);
		sc.close();
	}

}
