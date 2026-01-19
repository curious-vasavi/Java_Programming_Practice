package array_Programming.advance.day_14;
//3. Check if the sum of all even elements is a strong number. 
import java.util.*;
public class StrongNumberOfEvenSum 
{
	public static int evenSum(int [] arr)
	{
		int sum = 0;
		for(int i = 0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
				sum = sum+arr[i];
		}
		System.out.println("The sum of the even elements :"+sum);
		return sum;
	}
	public static int factorial(int num)
	{
		int fact = 1;
		for(int i = 1;i<=num;i++)
		{
			fact = fact*i;
		}
		return fact;
	}
	public static boolean isStrong(int num)
	{
		int temp = num;
		int sum = 0;
		while(num>0)
		{
			int ld = num = num %10;
			sum = sum + factorial(ld);
			num = num/10;
		}
		return sum == temp;
	}
	public static void strongNumberOfEvenSum(int [] arr)
	{
		int sumOfEvenElemnents = evenSum(arr);
		if(isStrong(sumOfEvenElemnents))
			System.out.println(sumOfEvenElemnents +" is a Strong number");
		else
			System.out.println(sumOfEvenElemnents + " is not a Strong number");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the elements :");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter "+size+" elements:");
		for(int i = 0;i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		strongNumberOfEvenSum(arr);
		sc.close();
	}
}
