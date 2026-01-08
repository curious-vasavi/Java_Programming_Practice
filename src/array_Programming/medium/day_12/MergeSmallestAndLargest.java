package array_Programming.medium.day_12;
//7. Merge the largest and smallest elements from two arrays into a single array. 

import java.util.Scanner;

public class MergeSmallestAndLargest 
{
	public static int findSmallest(int [] arr)
	{
		int smallest = arr[0];
		for(int i = 1;i<arr.length;i++)
		{
			if(arr[i] < smallest)
				smallest = arr[i];
		}
		return smallest;
	}
	
	public static int findLargest(int [] arr)
	{
		int largest = arr[0];
		for(int i = 1;i<arr.length;i++)
		{
			if(arr[i]>largest)
				largest = arr[i];
		}
		return largest;
	}
	
	public static int[] mergeSmallestAndLargest(int [] arr1 , int [] arr2)
	{
		int [] result = new int[4];
		
		result[0] = findSmallest(arr1);
		result[1] = findLargest(arr1);
		result[2] = findSmallest(arr2);
	    result[3] = findLargest(arr2);

	        return result;
	    }

	    public static void printArray(int[] arr)
	    {
	        System.out.print("Merged smallest and largest elements: ");
	        for (int i = 0; i < arr.length; i++)
	        {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter size of first array:");
	        int n1 = sc.nextInt();
	        int[] arr1 = new int[n1];

	        System.out.println("Enter elements of first array:");
	        for (int i = 0; i < arr1.length; i++)
	        {
	            arr1[i] = sc.nextInt();
	        }

	        System.out.println("Enter size of second array:");
	        int n2 = sc.nextInt();
	        int[] arr2 = new int[n2];

	        System.out.println("Enter elements of second array:");
	        for (int i = 0; i < arr2.length; i++)
	        {
	            arr2[i] = sc.nextInt();
	        }

	        int[] merged = mergeSmallestAndLargest(arr1, arr2);
	        printArray(merged);

	        sc.close();
	    }
	 }


