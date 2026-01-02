package array_Programming.medium.day_10;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfEvenElements 
{
	public static void sumOfEven(int [] arr)
	{
		int sum = 0;
		System.out.println("The even elements in the array are ");
		for(int i = 0;i<=arr.length-1;i++)
		{
			if(arr[i]%2 == 0)
			{
				System.out.print(arr[i] + " "+ "\n");
				sum = sum + arr[i];
			}
		}
		
		System.out.println("The sum of the even elements in the array is : "+ sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int [] arr = new int [size];
		System.out.println("Enter " + size + " elements :");
		for(int i = 0;i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		sumOfEven(arr);
		sc.close();
	}

}
