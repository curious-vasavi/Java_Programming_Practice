package number_Programming.medium.day_04;
import java.util.*;
public class SmallestDigit 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		smallestDigit(num);
		sc.close();
	}
	public static void smallestDigit(int num)
	{
		int smallest = 9;
		while(num > 0)
		{
			int ld = num % 10;
			if(ld<smallest)
			{
				smallest = ld;
			}
			num = num / 10;
		}
		System.out.println("The smallest Digit in the number : " + smallest);
	}

}
