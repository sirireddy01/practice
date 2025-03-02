package basicJava;

import java.util.Scanner;

public class program3 {
//Write a Java program to print numbers from 1 to N using a for loop
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number k");
		int k= s.nextInt();
		for (int i=1;i<=k;i++) {
			System.out.print(i+" ");
			
		}
		
}
}
