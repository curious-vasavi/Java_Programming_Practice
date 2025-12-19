package number_Programming.medium.day_03;
import java.util.*;
//print factorial of even digit in the number
public class FactorialOfEvenDigit 
{
	public static int factorial(int num)
	{
		int fact = 1;
		for(int i = 1;i<=num;i++)
		{
			fact = fact * i;
		}
		return fact;
	}
	public static void even(int num)
	{
		if(num == 0)
		{
			System.out.println(factorial(0));
			return ;
		}
		
		while(num>0)
		{
			int ld = num % 10;
			if(ld % 2 == 0)
			{
				System.out.println(factorial(ld));;
			}
			num = num / 10;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		even(num);
		sc.close();
	}
}
