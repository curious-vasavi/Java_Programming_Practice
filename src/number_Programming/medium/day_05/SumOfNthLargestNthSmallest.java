package number_Programming.medium.day_05;
import java.util.*;
public class SumOfNthLargestNthSmallest
{
	public static int largest(int num)
	{
		int largest = 0;
		while(num>0)
		{
			int ld = num % 10;
			if(ld>largest)
			{
				largest = ld;
			}
			num=num/10;
		}
		return largest;
	}
	public static int smallest(int num)
	{
		int smallest = 9;
		while(num>0)
		{
			int ld = num % 10;
			if(ld<smallest)
			{
				smallest = ld;
				
			}
			num = num / 10;
		}
		return smallest;
	}
	public static int removeDigit(int num,int digitToRemove)
	{
		int rev = 0;
		while(num > 0)
		{
			int ld = num%10;
			if(ld != digitToRemove)
			{
				rev = rev* 10+ld;
			}
			num = num /10;
		}
		int result = 0;
		while(rev > 0)
		{
			result = result*10+(rev%10);
			rev = rev/10;
		}
		return result;
	}
	public static int nthLargest(int num,int n)
	{
		if(num<=0)
		{
			return -1;
		}
		int temp = num;
		for(int k = 1;k<=n;k++)
		{
			if(temp == 0)
			{
				return -1;
			}
			int largest = largest(temp);
			if(k ==n)
			{
				return largest;
			}
			temp= removeDigit(temp,largest);
		}
		return -1;
	}
	public static int nthSmallest(int num,int n)
	{
		if(num<=0)
		{
			return -1;
		}
		int temp = num;
		for(int k = 1;k<=n;k++)
		{
			if(temp == 0)
			{
				return -1;
			}
			int smallest= smallest(temp);
			if(k==n)
			{
				return smallest;
			}
			temp = removeDigit(temp, smallest);
		}
		return -1;
	}
	public static void display(int num , int n)
	{
		int nthLargest = nthLargest(num, n);
		int nthSmallest = nthSmallest(num, n);
		if(nthLargest == -1 || nthSmallest==-1)
		{
			System.out.println("Invalid number " + n + "th largset/smallest number doesn't exist");
		}
		else
		{
			int sum = nthLargest + nthSmallest;
			System.out.println(n+"th largest digit = "+nthLargest);
			System.out.println(n + "th smallest digit = " +nthSmallest);
			System.out.println("Sum = " + sum);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		System.out.println("Enter the nth number for smallest and largest :");
		int n = sc.nextInt();
		display(num, n);
		sc.close();
	}
}
