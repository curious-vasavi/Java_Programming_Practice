package patterns_Programming.core.day_15;

import java.util.Scanner;

/*
 	  	Hollow Triangle Pattern 
 	  	*
		**
		* *
		*  *
		*****
 */
public class HollowTriangle
{
	public static void hollow(int row)
	{
		for(int i = 1;i<=row;i++)
		{
			for(int j = 1;j<=i;j++)
			{
				if(i==j||i==row||j==1)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = sc.nextInt();
		hollow(row);
		sc.close();
		
	}
}
