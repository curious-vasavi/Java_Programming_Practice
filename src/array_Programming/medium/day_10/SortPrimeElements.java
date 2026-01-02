package array_Programming.medium.day_10;

import java.util.Arrays;
import java.util.Scanner;

//20. Sort only the prime elements in a given array. 

public class SortPrimeElements
{
	public static boolean isPrime(int num)
	{
		if(num<=1)
			return false;
		for(int i = 2 ; i<= num / 2;i++)
		{
			if(num % i == 0)
				return false;
		}
		return true;
	}
	public static void sortPrimeElements(int [] arr)
	{
		for(int i = 0;i<arr.length;i++)
		{
			if(isPrime(arr[i]))
			{
				for(int j = i+1;j<arr.length;j++)
				{
					if(isPrime(arr[j]) && arr[i] > arr[j])
					{
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
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

        sortPrimeElements(arr);

        System.out.println("Array after sorting only prime elements: " + Arrays.toString(arr));

        sc.close();
		
	}
}
