package array_Programming.medium.day_10;
//10. Check if the multiplication of the last two elements in an array is even. 

import java.util.Scanner;

public class MultiplicationOfLastTwoElementsIsEven 
{
	public static void multiplicationOfLastTwoElements(int [] arr)
	{
		int last = arr[arr.length-1];
		int secondLast = arr[arr.length-2];
		int multiply = last * secondLast;
		System.out.println("The last element is " + last);
		System.out.println("The last second element is "+ secondLast);
		System.out.println("The multiplication of last two elements in an array is " + multiply);
		
		if(multiply % 2 == 0)
		{
			System.out.println("The last two elements are even");
		}
		else
		{
			System.out.println("The last two elements are not even");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		
		if(size<2)
		{
			System.out.println("The size of the array should atleast be 2");
			sc.close();
			return;
		}
		
		int [] arr = new int[size];
		System.out.println("Enter " + size + " elements : ");
		for(int i = 0;i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		multiplicationOfLastTwoElements(arr);
		sc.close();
	}

}
