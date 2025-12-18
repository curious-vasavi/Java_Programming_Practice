package number_Programming.medium.day_02;
import java.util.*;
public class CountDigits
{
	public static int count(int num)
	{
		int count = 0;
		while(num>0)
		{
			num= num/10;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("The count of digits in the number :" + count(num));
		sc.close();
	}
}
