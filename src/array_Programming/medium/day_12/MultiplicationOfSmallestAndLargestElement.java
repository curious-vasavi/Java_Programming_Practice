package array_Programming.medium.day_12;
import java.util.Arrays;
import java.util.Scanner;
//1. Calculate the multiplication of the largest and smallest elements in an array. 
public class MultiplicationOfSmallestAndLargestElement 
{
	public static void printMultiplicationOfSmallestAndLargest(int arr[])
	{
		int smallest = arr[0];
		int largest = arr[0];
		
		for(int i = 1;i<arr.length;i++)
		{
			if(arr[i] < smallest)
			{
				smallest = arr[i];
			}
			if(arr[i]>largest)
			{
				largest = arr[i];
			}
		}
		System.out.println("Smallest element : "+ smallest);
		System.out.println("Largest element : "+largest);
		System.out.println("Multiplication of smallest and largest element is "+(smallest * largest));	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter "+size + " elements : ");
		for(int i = 0;i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Array : "+ Arrays.toString(arr));
		printMultiplicationOfSmallestAndLargest(arr);
		sc.close();
	}

}
