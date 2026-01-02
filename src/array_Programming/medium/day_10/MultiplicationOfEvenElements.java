package array_Programming.medium.day_10;

import java.util.Arrays;
import java.util.Scanner;

//7. Calculate the multiplication of all even elements in an array. 
public class MultiplicationOfEvenElements
{
	public static void multiplicationOfEvenElements(int [] arr)
	{
		int multiply = 1;
		System.out.println("The even elements in the array are :");
		for(int i = 0;i<=arr.length-1;i++)
		{
			if(arr[i]%2 ==0)
			{
				System.out.println(arr[i] + " ");
				multiply = multiply*arr[i];
			}
		}
		System.out.println("The multiplication of the even elements in the array is " + multiply);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter "+size+ " elements : ");
		for(int i = 0;i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		multiplicationOfEvenElements(arr);
		sc.close();
	}

}
