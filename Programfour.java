package basicJava;

import java.util.Scanner;

public class Programfour {
//Write a Java program to add two numbers. user has to input those two numbers
	public static void main(String[] args) {
		Scanner A= new Scanner(System.in);
		System.out.println("Enter First Number");
		int s = A.nextInt();
		Scanner B = new Scanner(System.in);
		System.out.println("Enter Second Number");
		int c = B.nextInt(); 
		int d = s + c ;
		System.out.println(d+" "+"is the total of 2 numbers");
		
		
	}
}
