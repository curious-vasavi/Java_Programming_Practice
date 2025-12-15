package number_Programming.core.day_01;
import java.util.*;
//1.write a program to check whether the number is even or odd
public class EvenOrOdd
{
	
public static void evenOdd(int num)
{
	if(num % 2 == 0)
	{
		System.out.println("Number is even ");
		
	}
	else
		System.out.println("Number is odd");
}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		evenOdd(num);
		sc.close();
	}
		

}
