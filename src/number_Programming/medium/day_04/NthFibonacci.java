package number_Programming.medium.day_04;
import java.util.*;
public class NthFibonacci
{
	public static boolean isFibonacci(int num)
	{
		if(num ==0 || num == 1)
			return true;
		int firstNum = 0;
		int secondNum = 1;
		int sum = 0;
		for(int i = 1;i<= num ; i++)
		{
			sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;
			
			if(sum == num)
				return true;
		}
		return false;
	}
	public static void display(int num)
	{
		if(isFibonacci(num))
			System.out.println(num + " is a fibonacci number");
		else
			System.out.println(num + " is not a fibonacci number");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		display(num);
		sc.close();
	}
}
