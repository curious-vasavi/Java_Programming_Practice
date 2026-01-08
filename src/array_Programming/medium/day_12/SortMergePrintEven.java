package array_Programming.medium.day_12;

import java.util.Scanner;

//5. Sort two arrays in ascending order, merge them, and print only the even numbers. 
public class SortMergePrintEven 
{
	public static void sortArray(int [] arr)
	{
		for(int i = 0;i<=arr.length;i++)
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
	public static int[] mergeArrays(int [] arr1,int [] arr2)
	{
		int [] merged = new int[arr1.length + arr2.length];
		int index = 0;
		for(int i = 0;i<arr1.length;i++)
		{
			merged[index++] = arr1[i];
		}
		for(int i = 0 ;i<arr2.length;i++)
		{
			merged[index++] = arr2[i];
		}
		return merged;
	}
	public static void printEvenElements(int [] arr)
	{
		System.out.println("Even elements after sorting and merging : ");
		int count = 0;
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]%2 == 0)
			{
				System.out.println(arr[i] + " ");
				count++;
			}
		}
		if(count == 0)
		{
			System.out.println("None");
		}
		System.out.println();
	}
	public static void main(String[] args) {
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

        sortArray(arr1);
        sortArray(arr2);

        int[] mergedArray = mergeArrays(arr1, arr2);

        printEvenElements(mergedArray);
        sc.close();
	}
}
