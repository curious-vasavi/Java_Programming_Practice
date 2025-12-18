package number_Programming.medium.day_02;
import java.util.*;
public class MultiplicationTable 
{
	public static void multiplication(int num)
	{
		for(int i = 1;i<=10;i++)
		{
			int res = num * i;
			System.out.println(num + " X " + i + " = " + res);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ..");
		int num = sc.nextInt();
		System.out.println(num + " Table");
		multiplication(num);
		sc.close();
	}
}
