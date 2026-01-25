package patterns_Programming.core.day_15;
/*
  Inverted full pyramid using `*` 
	********* 
	 ******* 
	  ***** 
	   *** 
	    * 
 */
import java.util.*;
public class InvertedFullPyramid 
{
	public static void invertedFullPyramid(int row,int col)
	{
		for(int i = row;i>=1;i--)
		{
			for(int space = 1;space<=row-i;space++)
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
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows :");
		int row = sc.nextInt();
		System.out.println("Enter number of columns :");
		int col = sc.nextInt();
		invertedFullPyramid(row, col);
		sc.close();
	}
}
