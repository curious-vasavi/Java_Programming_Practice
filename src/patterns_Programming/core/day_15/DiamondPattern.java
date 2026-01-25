package patterns_Programming.core.day_15;
/*
 Diamond Pattern (Size = 5) 
		    * 
		   *** 
		  ***** 
		 ******* 
		********* 
		 ******* 
		  ***** 
		   *** 
		    *
 */
import java.util.*;
public class DiamondPattern 
{
	public static void diamondPattern(int row,int col)
	{
		for(int i = 1;i<=row-1;i++) // row -1 because we need to print the middle row exactly once
		{
			for(int space = 1;space <= row-i;space++)
			{
				System.out.print(" ");
			}
			for(int j = 1 ; j<=i*2-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
		for(int i = row;i>=1;i--)
		{
			for(int space = 1;space <= row - i;space++)
			{
				System.out.print(" ");
			}
			for(int j = 1;j<=i*2-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int row = sc.nextInt();
		System.out.println("Enter the number of column :");
		int col = sc.nextInt();
		diamondPattern(row,col);
		sc.close();	
	}
}

