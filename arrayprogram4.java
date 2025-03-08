package basicJava;

import java.util.Arrays;

public class arrayprogram4 {
//Write a Java program to find the second largest element in an array.
	public static void main(String[]args) {
		int i[]= {1,2,3,4,5};
		Arrays.sort(i);// sorts an array in ascending order
		int largestelement=i[i.length-2];
		System.out.println(largestelement);
	}
}
