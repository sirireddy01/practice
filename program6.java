package basicJava;

import java.util.Scanner;

public class program6 {
//Write a Java program to print the multiplication table of a number using a for loop.
	public static void main (String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num= s.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num*i);
		}
	}
}
