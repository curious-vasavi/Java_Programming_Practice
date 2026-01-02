package array_Programming.medium.day_10;

import java.util.Arrays;
import java.util.Scanner;

//19. Sort only the even elements in a given array. 
public class SortEvenElements
{
	public static void sortEvenElements(int[] arr)
	{
		int n = arr.length;
		for(int i = 0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				for(int j = i+1;j<n;j++)
				{
					if(arr[j]%2 == 0 && arr[i]>arr[j])
					{
						
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp ;
					}
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

	        System.out.println("Original Array: " + Arrays.toString(arr));
	        sortEvenElements(arr);
	        System.out.println("Array after sorting only even elements: " + Arrays.toString(arr));

	        sc.close();
		
	}

}
