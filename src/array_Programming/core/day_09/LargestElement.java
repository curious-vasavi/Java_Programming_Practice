package array_Programming.core.day_09;

import java.util.Arrays;
import java.util.Scanner;

//9. WAPT Print the largest element in a given array. 

public class LargestElement 
{
	public static int largestElement(int [] arr)
	{
		int largest = arr[0];
		for(int i = 0;i<=arr.length-1;i++)
		{
			if(arr[i]>largest)
			{
				largest = arr[i];
			}
		}
		System.out.println("The largest element in the array is " + largest);
		return largest;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter " + size + " elements : ");
		for(int i = 0;i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		largestElement(arr);
		sc.close();
		
	}

}
