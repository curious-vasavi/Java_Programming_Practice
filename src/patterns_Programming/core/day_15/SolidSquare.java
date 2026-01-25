package patterns_Programming.core.day_15;
/*
 Solid square of `*` (5x5) 
 
***** 
***** 
***** 
***** 
***** 

 */
import java.util.*;
public class SolidSquare 
{
	public static void solidSquare(int row,int col)
	{
		for(int i = 1; i <=row;i++)
		{
			for(int j = 1;j<=col;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int row = sc.nextInt();
		System.out.println("Enter number of columns :");
		int col = sc.nextInt();
		solidSquare(row, col);
		sc.close();
		
	}

}
