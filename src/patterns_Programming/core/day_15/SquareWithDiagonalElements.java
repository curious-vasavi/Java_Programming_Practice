package patterns_Programming.core.day_15;
/*

 Square with diagonal elements as `*`, rest as space 
*     * 
 *   * 
   * 
 *   * 
*      * 

*/
import java.util.*;
public class SquareWithDiagonalElements
{
	public static void squareDiagonal(int row,int col)
	{
		for(int i = 1;i<=row;i++)
		{
			for(int j = 1;j<=col;j++)
			{
				if(i==j || i + j == row+1)
				{
					System.out.print("*" + " ");
				}
				else
				{
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = sc.nextInt();
		System.out.println("Enter the number of columns : ");
		int col = sc.nextInt();
		squareDiagonal(row, col);
		sc.close();
	}
}
