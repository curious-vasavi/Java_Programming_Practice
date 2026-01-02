package array_Programming.medium.day_10;

import java.util.Arrays;
import java.util.Scanner;

//6. Calculate the multiplication of all elements in an array. 

public class MulitiplicationOfElements 
{
	public static void multiplication(int [] arr)
	{
		int multiply = 1;
		for(int i = 0;i<=arr.length-1;i++)
		{
			multiply = multiply * arr[i];
		}
		System.out.println("The multiplication of the elements is "+ multiply);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int [] arr = new int [size];
		System.out.println("Enter "+size+" elements : ");
		for(int i = 0 ; i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		multiplication(arr);
		sc.close();
	}

}
