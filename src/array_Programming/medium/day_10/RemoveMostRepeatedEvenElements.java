package array_Programming.medium.day_10;

import java.util.Arrays;
import java.util.Scanner;
//13. Remove the most repeated even elements from an array. 

public class RemoveMostRepeatedEvenElements 
{
	public static void removeMostRepeated(int [] arr)
	{
		int n = arr.length;
		boolean [] visited = new boolean[n];
		int maxFreq = 0;
		
		for(int i = 0;i<n;i++)
		{
			if(visited[i] || arr[i] % 2 != 0)
			{
				continue;
			}
			int count = 1;
			for(int j = i+1;j<n;j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
					visited[j] = true;
				}
			}
			if(count > maxFreq)
			{
				maxFreq = count;
			}
		}
		System.out.println("Array after removing most repeated even elements :");
		
		for(int i = 0;i<n;i++)
		{
			if(arr[i] % 2 != 0)
			{
				System.out.println(arr[i] + " ");
			}
			else
			{
				int count = 0;
				for(int j = 0;j<n;j++)
				{
					if(arr[i] == arr[j])
					{
						count++;
					}
				}
				if(count != maxFreq)
				{
					System.out.println(arr[i] + " ");
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array :");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter "+size + " elements : ");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Original Array : " + Arrays.toString(arr));
		removeMostRepeated(arr);
		sc.close();
	}
}
