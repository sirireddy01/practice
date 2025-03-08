package basicJava;

public class Arrayprogramtwo {
//Write a Java program to find the sum of all elements in an array.
	public static void main(String[]args) {
		int i[]= {1,2,3,4,5};
		int sum=0;
		for(int k=0;k<i.length;k++) {
			sum+=i[k];
		}
		System.out.println(sum);
	}
}
