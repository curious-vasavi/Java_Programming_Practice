package array_Programming.core.day_09;

import java.util.Arrays;
import java.util.Scanner;

//7. WAPT Sort an array without using predefined methods. 
public class SortArray
{
	public static void sort(int [] arr)
	{
		for(int i = 0;i<=arr.length;i++)
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		System.out.println("Arrays in Ascending Order");
		for(int num : arr)
		{
			System.out.println(num + " ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array :");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter " + size + " elements");
		for(int i = 0;i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		sort(arr);
	}
}
