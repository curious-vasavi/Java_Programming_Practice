package array_Programming.medium.day_10;
//14. Write a Java program to remove duplicates from a sorted array. 

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray 
{
	public static void removeDuplicate(int [] arr)
	{
		int n = arr.length;
		if(n == 0)
		{
			return;
		}
		int [] temp = new int [n];
		int j = 0;
		temp[j++] = arr[0];
		for(int i = 1 ; i<n;i++)
		{
			if(arr[i] != arr[i-1])
			{
				temp[j++] = arr[i];
			}
		}
		System.out.println("Array after removing duplicates : ");
		for(int i = 0;i<j ;i++)
		{
			System.out.println(temp[i] + " ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the size of the sorted array:");
	        int size = sc.nextInt();

	        int[] arr = new int[size];

	        System.out.println("Enter " + size + " sorted elements:");
	        for (int i = 0; i < arr.length; i++)
	        {
	            arr[i] = sc.nextInt();
	        }

	        System.out.println("Original Array: " + Arrays.toString(arr));
	        removeDuplicate(arr);
	        sc.close();
	}
}
