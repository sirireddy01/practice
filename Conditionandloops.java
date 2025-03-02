package basicJava;

import java.util.Scanner;

public class Conditionandloops {
//Write a Java program to check whether a number is even or odd using an if-else statement
	public static void main (String[]args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter the number");
		int i= s.nextInt();
		if (i%2 ==0) {
		System.out.println("The number is Even");
		}else {
			System.out.println("The number is odd");
		}
		s.close();
	}
}
