package array_Programming.advance.day_14;
//4. Check if the sum of all odd elements is an Armstrong number. 
import java.util.*;
public class ArmstrongNumberOfOddElements 
{
	public static int sumOfOddElements(int [] arr)
	{
		int sum = 0;
		for(int i = 0;i<=arr.length-1;i++)
		{
			if(arr[i] % 2 !=0)
			{
				sum = sum + arr[i];
			}
		}
		System.out.println("The sum of odd elments is " + sum);
		return sum;
	}
	public static int count(int num)
	{
		int count = 0;
		while(num>0)
		{
			num = num/10;
			count++;
		}
		return count;
	}
	public static int expo(int base,int power)
	{
		int expo = 1;
		for(int i = 1;i<=power;i++)
		{
			expo = expo * base;
		}
		return expo;
	}
	public static int sumOfExponential(int num)
	{
		int power = count(num);
		int sum = 0;
		int temp = num;
		while(temp>0)
		{
			int ld = temp % 10;
			int expo = expo(ld,power);
			sum = sum + expo;
			temp = temp/10;
		}
		return sum;
	}
	public static void checkArmstrongNumberOfOddElements(int num)
	{
		int sum = sumOfExponential(num);
		if(sum == num)
		{
			System.out.println(num + " is a Armstrong number");
			
		}
		else
			System.out.println(num + " is not a Armstrong number");	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter "+size+ " elements:");
		for(int i = 0;i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Arrays "+ Arrays.toString(arr));
		int oddSum = sumOfOddElements(arr);
		checkArmstrongNumberOfOddElements(oddSum);
		sc.close();
	}
}
