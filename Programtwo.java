package basicJava;

import java.util.Scanner;

public class Programtwo {
// Write a Java program to find the largest among three numbers using if-else statements
	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter number 1");
		int n1= s1.nextInt();
		Scanner s2= new Scanner(System.in);
		System.out.println("Enter number 2");
		int n2= s2.nextInt();
		Scanner s3= new Scanner(System.in);
		System.out.println("Enter number 3");
		int n3= s3.nextInt();
		if(n1>n2 && n1>n3) {
			System.out.println(n1+ "is the larger number");
			
		}else if (n2>n1 && n2 >n3){
			System.out.println(n2+ "is the larger number");
	}
		else {
			System.out.println(n3 + "is the larger number");
		
			
		}
	}
}