package array_Programming.core.day_09;

import java.util.Arrays;
import java.util.Scanner;
//1. WAPT Print all elements in an array. 

public class PrintingArrayElements 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		System.out.println("Enter " + size + " elements : ");
		int [] arr = new int [size];
		for(int i = 0;i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i = 0;i<=arr.length-1;i++)
		{
			System.out.println("The elements present at the index " + i + " is " + arr[i]);
		}
		System.out.println("The array reperesentation is " + Arrays.toString(arr));
	}

}
