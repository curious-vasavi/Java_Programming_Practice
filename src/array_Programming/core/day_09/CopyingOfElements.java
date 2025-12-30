package array_Programming.core.day_09;

import java.util.Arrays;
import java.util.Scanner;

//12. WAPT to copy all elements from one array to another array. 

public class CopyingOfElements 
{
	public static int[] copyArray(int [] original)
	{
		int [] copy = new int [original.length];
		for(int i = 0;i<original.length;i++)
		{
			copy[i] = original[i];
		}
		return copy;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int [] arr = new int [size];
		System.out.println("Enter "+ size +" elements :");
		for(int i = 0 ;i<= arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int [] arr2 = copyArray(arr);
		System.out.println("Original Array : " + Arrays.toString(arr));
		System.out.println("Copied Array : " + Arrays.toString(arr2));
		
		sc.close();
	}
}
