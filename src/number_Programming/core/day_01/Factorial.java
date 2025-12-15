package number_Programming.core.day_01;
import java.util.*;
//10.write a program to produce the factorial value of a number .
public class Factorial
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int fact = 1;
		for(int i = 1;i<=num;i++)
		{
			fact = fact * i;
		}
		System.out.println("The factorial of " + num + " is " + fact );
	}

}
