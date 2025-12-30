package array_Programming.core.day_09;

import java.util.Arrays;
import java.util.Scanner;

//10. WAPT Print the smallest element in a given array. 
public class SmallestElement 
{
	public static int smallest(int [] arr)
	{
		int smallest = arr[0];
		for(int  i = 0;i<=arr.length-1;i++)
		{
			if(arr[i]<smallest)
			{
				smallest = arr[i];
			}
		}
		System.out.println("The smallest element in the array : "+ smallest);
		return smallest;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter "+ size + " elements :");
		for(int i = 0;i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		smallest(arr);
		sc.close();
	}

}
