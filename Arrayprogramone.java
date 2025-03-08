package basicJava;

public class Arrayprogramone {
//Write a Java program to find the largest element in a given array.
	public static void main(String[]args) {
		int i[]= {1,2,3,4,5};
		int max=i[0];
		for(int s :i) {
			if(s>max);
			max=s;
			
		}
		System.out.println("The largest number of the array is"+ max);
	}
}