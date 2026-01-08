package array_Programming.medium.day_12;
//4. Merge only the even elements from two arrays into a single array and print it in reverse 

import java.util.Arrays;
import java.util.Scanner;

public class MergeEvenElementsReverse 
{
	public static int countEven(int arr[])
	{
		int count = 0;
		for(int i = 0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
				count++;
		}
		return count;
	}
	public static int[] mergeEvenElements(int [] arr1,int [] arr2)
	{
		int size = countEven(arr1)+countEven(arr2);
		int [] merged = new int[size];
		int index = 0;
		
		for(int i = 0;i<arr1.length;i++)
		{
			if(arr1[i]%2==0)
				merged[index++] = arr1[i];
		}
		for(int i = 0;i<arr2.length;i++)
		{
			if(arr2[i]%2==0)
				merged[index++]=arr2[i];
		}
		return merged;
	}
	public static void printReverse(int [] arr)
	{
		System.out.println("Merged even elements in reverse order : ");
		for(int i = arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the first array :");
		int n1 =sc.nextInt();
		int [] arr1 = new int[n1];
		System.out.println("Enter "+ n1 + " elements :");
		for(int i = 0;i<=arr1.length-1;i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.println("Array : "+Arrays.toString(arr1));
		
	    System.out.println("Enter the size of the second array :");
	    int n2 = sc.nextInt();
	    int [] arr2 = new int [n2];
	    System.out.println("Enter "+n2 + "elements :");
	    for(int i = 0;i<=arr2.length-1;i++)
	    {
	    	arr2[i] = sc.nextInt();
	    }
	    System.out.println("Array :"+Arrays.toString(arr2));
	    
	    int [] mergedEvenElements = mergeEvenElements(arr1, arr2);
	    printReverse(mergedEvenElements);
	    sc.close();
}
}
