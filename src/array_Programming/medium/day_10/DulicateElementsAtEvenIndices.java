package array_Programming.medium.day_10;

import java.util.Arrays;
import java.util.Scanner;

public class DulicateElementsAtEvenIndices 
{
	public static void printDuplicateAtEvenIndices(int [] arr)
	{
		System.out.println("Duplicate elements at even indices :");
		for(int i = 0; i< arr.length;i =i+2)
		{
			boolean alreadyPrinted = false;
			
			for(int k = 0; k<i;k+=2)
			{
				if(arr[i] == arr[k])
				{
					alreadyPrinted = true;
					break;
				}
			}
			if(alreadyPrinted)
				continue;
			for(int j = i+2;j<arr.length;j+=2)
			{
				if(arr[i] == arr[j])
				{
					System.out.print(arr[i] + " ");
					break;
				}
			}
		}
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
	        printDuplicateAtEvenIndices(arr);

	        sc.close();
	    }		
}

