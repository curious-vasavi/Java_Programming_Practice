package number_Programming.core.day_01;
import java.util.*;
// 4.write a program to count the numbers between m to n 
public class Count 
{
	public static int count(int m , int n)
	{
		int count = 0;
		for(int i = m ;i<=n;i++)
		{
			count++;
		}
		return count;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter m value :");
	int m = sc.nextInt();
	System.out.println("enter n value : ");
	int n = sc.nextInt();
	System.out.println("count of numbers from range " + m + " to " + n + " is " + count(m, n));
	sc.close();
}
}
