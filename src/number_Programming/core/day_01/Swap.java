package number_Programming.core.day_01;
import java.util.*;
//5 and 6. write a program to swap two numbers
public class Swap 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value :");
		int a = sc.nextInt();
		System.out.println("Enter b value :");
		int b = sc.nextInt();
		System.out.println("Before Swapping \na = " + a + " and b = " + b );
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping \na = " + a + " and b = " + b);
		
	}

}
