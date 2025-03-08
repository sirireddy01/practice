package basicJava;

import java.util.Scanner;

public class Programseven {
//Find the factorial of a number using a for loop
	public static void main(String[]args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter Number");
		int i= s.nextInt();
		int j=1;
		for(int k=1;k<=i;k++) {
			j*=k;
			
		}
		System.out.println("The Factorial of the given number is"+" "+j);
	}
	
}
