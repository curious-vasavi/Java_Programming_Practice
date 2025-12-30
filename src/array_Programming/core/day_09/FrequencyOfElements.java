package array_Programming.core.day_09;

import java.util.Arrays;
import java.util.Scanner;

//11. WAPT Find the frequency of each element in an array. 
public class FrequencyOfElements 
{
	public static void frequency(int [] arr)
	{
		int visited = Integer.MIN_VALUE;
		for(int i = 0;i<=arr.length-1;i++)
		{
			if(arr[i] == visited)
				continue;
			int count = 1;
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
					arr[j] = visited;
				}
			}
			System.out.println("Element " + arr[i] + " -> Frequency " + count);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter " + size + " elements :");
		for(int i = 0;i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		frequency(arr);
		sc.close();
	}
}
