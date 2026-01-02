package array_Programming.medium.day_10;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfFirstAndLastElement 
{
	public static void sumOfFirstAndLastElement(int [] arr)
	{
		int first = arr[0];
		int second = arr[arr.length-1];
		int sum = first + second;
		System.out.println("The sum of first element is "+ first);
		System.out.println("The sum of second element is "+ second);
		System.out.println("The sum of first and last element in the array is " + sum);
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
		sumOfFirstAndLastElement(arr);
		sc.close();
	}

}
