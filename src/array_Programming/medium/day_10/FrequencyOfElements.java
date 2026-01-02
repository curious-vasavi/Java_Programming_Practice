package array_Programming.medium.day_10;
//11. Write a Java program to find the frequency of each element in an array. 

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfElements 
{
	public static void frequency(int [] arr)
	{
		boolean [] visited = new boolean[arr.length];
		System.out.println("Elements : Frequency");
		for(int i = 0;i<arr.length;i++)
		{
			if(visited[i])
			{
				continue;
			}
			int count = 1;
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
					visited[j] = true;
				}
			}
			System.out.println(arr[i] + " : " + count);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter "+size+" elements:");
		for(int i = 0;i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		frequency(arr);
		sc.close();
	}

}
