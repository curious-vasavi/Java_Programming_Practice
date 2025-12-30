package array_Programming.core.day_09;

import java.util.Arrays;
import java.util.Scanner;

//8. WAPT Merge two arrays. 

public class MergeArray 
{
	public static int [] mergeArray(int [] arr1, int [] arr2)
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
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of first array : ");
		int size = sc.nextInt();
		int [] arr1 = new int[size];
		
		System.out.println("Enter "+ size + " elements of first array :");
		for(int i = 0;i<arr1.length;i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter size of second array : ");
		int size2 = sc.nextInt();
		int [] arr2 = new int[size2];
		
		System.out.println("Enter "+ size2 + " elements of second array :");
		for(int i = 0;i<arr2.length;i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		int [] mergeArray = mergeArray(arr1,arr2);
		System.out.println("Merged Array : " + Arrays.toString(mergeArray));
		sc.close();
	}

}
