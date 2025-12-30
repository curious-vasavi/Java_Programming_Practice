package array_Programming.core.day_09;

import java.util.Scanner;

//4. WAPT Print all elements at even indices in an array. 

public class EvenIndices 
{
	public static void evenIndices(int [] arr)
	{
		System.out.println("Elements at even indices are : ");
		for(int j = 0;j<=arr.length-1;j=j+2)
		{
			System.out.println(arr[j]);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter "+ size + " elements :");
		for(int i = 0 ;i<= arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		evenIndices(arr);
		sc.close();
	}
}
