package array_Programming.medium.day_10;

import java.util.Arrays;
import java.util.Scanner;
//4. Calculate the sum of the last two elements in an array. 
public class SumOfLastTwoElements 
{
	public static void sumOfLastTwoElements(int [] arr)
	{
		int last = arr[arr.length-1];
		int lastSecond = arr[arr.length-2];
		int sum = last + lastSecond;
		System.out.println("The last element is "+ last);
		System.out.println("The last second element is "+ lastSecond);
		System.out.println("The sum of last two elements is "+sum);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter "+ size + " elements :");
		for(int i = 0;i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		sumOfLastTwoElements(arr);
		sc.close();
	}
}
