package patterns_Programming.core.day_15;
/*
 
Hollow square of `*` (5x5) 
***** 
*   * 
*   * 
*   * 
*****

 */
import java.util.*;
public class HollowSquare
{
	public static void hollowSquare(int row , int col)
	{
		for(int i = 1;i<=row;i++)
		{
			for(int j = 1;j<=col;j++)
			{
				if(i == 1||i==row||j==1||j==col)	
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int row = sc.nextInt();
		System.out.println("Enter the number of columns :");
		int col = sc.nextInt();
		hollowSquare(row, col);
		sc.close();	
	}
}
