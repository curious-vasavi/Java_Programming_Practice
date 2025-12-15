package number_Programming.core.day_01;
import java.util.*;
//11.write a program to produce the factors of the number.
public class Factors
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("The factors of " + num + " are ");
		for(int i = 1;i<=num;i++)
		{
			if(num % i == 0)
			{
				System.out.print(i + " ");
			}
		}
		sc.close();
	}

}
