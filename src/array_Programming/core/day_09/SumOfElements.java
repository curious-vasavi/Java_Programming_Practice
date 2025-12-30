package array_Programming.core.day_09;

import java.util.Arrays;
import java.util.Scanner;

//5. WAPT Calculate the sum of all elements in an array. 

public class SumOfElements
{
	public static void sum(int [] arr)
	{
		int sum = 0;
		
		for(int i = 0;i<=arr.length-1;i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("The sum of the elements in the array is : " + sum);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int [] arr = new int [size];
		System.out.println("Enter "+size+" elements :");
		for(int i = 0 ;i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Array representation : " + Arrays.toString(arr));
		sum(arr);
		sc.close();
	}

}
