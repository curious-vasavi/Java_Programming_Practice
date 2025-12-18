package number_Programming.medium.day_02;
import java.util.*;
// wap to print even digits in a given number
public class EvenDigits 
{
	public static void even(int num)
	{
		System.out.println("The even digits in the given number are : ");
		while(num>0)
		{
			int ld = num % 10;
			if(ld % 2 == 0)
			{
				System.out.println(ld);
			}
			num = num / 10;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		even(num);
		sc.close();
	}
}
