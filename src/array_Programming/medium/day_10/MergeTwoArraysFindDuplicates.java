package array_Programming.medium.day_10;

import java.util.Arrays;
import java.util.Scanner;

//16. Merge two arrays and find duplicate elements in the merged array. 
public class MergeTwoArraysFindDuplicates 
{
	public static int[] mergeArrays(int [] arr1, int [] arr2)
	{
		int [] merged = new int[arr1.length + arr2.length];
		int index = 0;
		
		for(int i = 0;i<arr1.length;i++)
		{
			merged[index++] = arr1[i];
		}
		for(int i = 0;i<arr2.length;i++)
		{
			merged[index++] = arr2[i];
		}
		return merged;
	}
	public static void printDuplicates(int [] arr)
	{
		System.out.println("Duplicate elements in merged array : ");
		for(int i = 0;i<arr.length;i++)
		{
			boolean alreadyPrinted = false;
			for(int k = 0;k<i;k++)
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
						break;
					}
				}
			}
		}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of first array : ");
		int n1 = sc.nextInt();
		int [] arr1 = new int[n1];
		System.out.println("Enter " + n1 + " elements :");
		for(int i = 0;i<arr1.length;i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println("Enter size of second array :");
		int n2 = sc.nextInt();
		int [] arr2 = new int[n2];
		
		System.out.println("Enter " + n2 + " elements :");
		for(int i = 0;i<arr2.length;i++)
		{
			arr2[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr2));
		int[] mergedArray = mergeArrays(arr1,arr2);
		System.out.println("Merged Array : " + Arrays.toString(mergedArray));
		printDuplicates(mergedArray);
		sc.close();
	}
}
