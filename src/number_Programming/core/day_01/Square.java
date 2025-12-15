package number_Programming.core.day_01;
import java.util.*;
//8.write a program to produce the square of a given number
public class Square
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int square = num  * num;
		System.out.println("The square of the given number is " + square);
	}

}
