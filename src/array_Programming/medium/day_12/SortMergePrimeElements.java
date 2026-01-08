package array_Programming.medium.day_12;

import java.util.Arrays;
import java.util.Scanner;
//6. Sort the prime numbers from two arrays and merge them into a single array. 
public class SortMergePrimeElements 
{
	public static boolean isPrime(int num)
	{
		if(num<=-1)
			return false;
		for(int i=2 ; i<=num/2;i++)
		{
			if(num%i ==0)
				return false;
		}
		return true;
	}
	public static int countPrime(int []arr)
	{
		int count = 0;
		for(int i = 0;i<arr.length;i++)
		{
			if(isPrime(arr[i]))
				count++;
		}
		return count;
	}
	public static int[] mergePrimeElements(int [] arr1,int [] arr2)
	{
		int size = countPrime(arr1)+countPrime(arr2);
		int [] prime = new int[size];
		int index = 0;
		for(int i = 0;i<arr1.length;i++)
		{
			if(isPrime(arr1[i]))
				prime[index++] = arr1[i];
		}
		for(int i = 0;i<arr2.length;i++)
		{
			if(isPrime(arr2[i]))
				prime[index++] = arr2[i];
		}
		return prime;
	}
	public static void sortArray(int [] arr)
	{
		for(int i = 0;i<=arr.length-1;i++)
		{
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void printArray(int [] arr)
	{
		if(arr.length==0)
		{
			System.out.println("No prime numbers found");
			return ;
		}
		System.out.println("Merged and sorted prime elements: ");
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of first array : ");
		int n1 = sc.nextInt();
		int [] arr1 = new int[n1];
		System.out.println("Enter elements of first array :");
		for(int i = 0;i<arr1.length;i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.println("Array : "+ Arrays.toString(arr1));
		
		System.out.println("Enter size of second array :");
		 int n2 = sc.nextInt();
	     int[] arr2 = new int[n2];

	     System.out.println("Enter elements of second array:");
	     for (int i = 0; i < arr2.length; i++)
	        {
	            arr2[i] = sc.nextInt();
	        }
	      System.out.println("Array : "+ Arrays.toString(arr2));
	      int[] mergedPrimes = mergePrimeElements(arr1, arr2);
	      sortArray(mergedPrimes);
	      printArray(mergedPrimes);
	      sc.close();
	}

}
