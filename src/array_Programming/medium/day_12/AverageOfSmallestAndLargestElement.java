package array_Programming.medium.day_12;
//2. Calculate the average of the largest and smallest elements in an array. 

import java.util.Arrays;
import java.util.Scanner;

public class AverageOfSmallestAndLargestElement 
{
	public static void printAverageOfSmallestAndLarget(int [] arr)
	{
		int smallest = arr[0];
		int largest = arr[0];
		for(int i = 1;i<arr.length;i++)
		{
			if(arr[i] < smallest)
			{
				smallest = arr[i];
			}
			if(arr[i]>largest)
			{
				largest = arr[i];
			}
			System.out.println("Smallest element :"+smallest);
			System.out.println("Largest element :"+largest);
			System.out.println("Average of smallest and largest :"+((smallest+largest)/2));
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size = sc.nextInt();
		int [] arr = new int [size];
		System.out.println("Enter "+size + " elements :");
		for(int i = 0;i<=arr.length-1;i++)
		{
			arr[i]= sc.nextInt();
		}
		System.out.println("Array :"+Arrays.toString(arr));
		printAverageOfSmallestAndLarget(arr);
		sc.close();
	}
}
