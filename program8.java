package basicJava;

import java.util.Scanner;

public class program8 {
//Check if a number is prime using a for loop
	public static void main(String[]args) {
		Scanner s= new Scanner (System.in);
		System.out.println("Enter a number");
		int k= s.nextInt();
		if (k%2!=0) {
			System.out.println("The number is prime");
			
		}else {
			System.out.println("The number is not prime");
		}
	}
}
