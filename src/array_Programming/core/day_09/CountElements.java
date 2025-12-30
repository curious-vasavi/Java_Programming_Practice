package array_Programming.core.day_09;

import java.util.Arrays;
import java.util.Scanner;
//2. WAPT to count the No. of elements in an array. 

public class CountElements 
{
	public static int count(int arr[])
	{
		int count = 0;
		for(int i = 0;i<=arr.length-1;i++)
		{
			count++;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
//		with no predefined input
//		System.out.println("Enter the size of the array : ");
//		int size = sc.nextInt();
//		System.out.println("Enter "+size + " elements :");
//		int [] arr = new int [size];
//		for(int i = 0 ;i<=arr.length-1;i++)
//			{
//				arr[i] = sc.nextInt();
//			}
		int [] arr = {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(arr));
		int result = count(arr);
		System.out.println("The count of the elements in the array is : " + result);
		sc.close();
	}
}
