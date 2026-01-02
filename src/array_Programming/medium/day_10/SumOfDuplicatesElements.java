package array_Programming.medium.day_10;

import java.util.Arrays;
import java.util.Scanner;

//17. Calculate the sum of duplicate elements in a given array. 
public class SumOfDuplicatesElements 
{
	public static void printDuplicatesAndSum(int [] arr)
	{
		int sum = 0;
		System.out.println("Duplicate elements : ");
		for(int i = 0;i<arr.length;i++)
		{
			boolean alreadyPrinted = false;
			for(int k = 0 ;k<i;k++)
			{
				if(arr[i] == arr[k])
				{
					alreadyPrinted = true;
					break;
				}
			}
			if(alreadyPrinted)
				continue;
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println(arr[i] + " ");
					sum = sum + arr[i];
					break;
				}
			}
		}
		System.out.println("Sum of duplicate elements :" + sum);
	}
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the size of the array:");
	        int size = sc.nextInt();

	        int[] arr = new int[size];

	        System.out.println("Enter " + size + " elements:");
	        for (int i = 0; i < arr.length; i++)
	        {
	            arr[i] = sc.nextInt();
	        }

	        System.out.println("Array: " + Arrays.toString(arr));
	        printDuplicatesAndSum(arr);

	        sc.close();
	}
}
