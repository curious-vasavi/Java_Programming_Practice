package patterns_Programming.core.day_15;
/*
 	Full pyramid using `*` 
 	     *
	    * *
	   * * *
	  * * * *
	
 */
import java.util.*;
public class FullPyramind 
{
	public static void fullPyramid(int row,int col)
	{
		for(int i = 1;i<=row;i++)
		{
			for(int j = col;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k = 1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows :");
		int row = sc.nextInt();
		System.out.println("Enter number of columns :");
		int col = sc.nextInt();
		fullPyramid(row, col);
		sc.close();	
	}
}
