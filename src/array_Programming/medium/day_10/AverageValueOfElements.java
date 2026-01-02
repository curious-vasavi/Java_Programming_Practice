package array_Programming.medium.day_10;
//9. Calculate the average value of all elements in a given array. 

import java.util.Arrays;
import java.util.Scanner;

public class AverageValueOfElements 
{
	public static int sum(int [] arr)
	{
		int sum = 0;
		for(int i = 0;i<=arr.length-1;i++)
		{
			sum = sum + arr[i];
		}
		return sum;
	}
	public static void average(int [] arr)
	{
		int sum = sum(arr);
		int average = sum/2;
		System.out.println("The average of the elements present in the array is "+ average);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter "+size+" elements:");
		for(int i = 0;i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		average(arr);
		sc.close();
		
	}
}
