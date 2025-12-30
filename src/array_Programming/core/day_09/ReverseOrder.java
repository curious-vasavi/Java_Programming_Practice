package array_Programming.core.day_09;
import java.util.Arrays;
import java.util.Scanner;
//3. WAPT Print the elements of an array in reverse order. 

public class ReverseOrder
{
	public static void printReverse(int [] arr)
	{
		int [] rev = new int [arr.length];
		int index = 0;
		System.out.println("Array in reverse order : ");
		for(int j =arr.length-1;j>=0;j--)
		{
			System.out.println(arr[j]);
			rev[index++] = arr[j];
		}
		System.out.println(Arrays.toString(rev));
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int [] arr = new int [size];
		System.out.println("Enter the elements : ");
		for(int i = 0 ; i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		printReverse(arr);
		sc.close();
	}
}
