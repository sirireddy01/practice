package basicJava;

public class Stringintroone {
//unlike int,float and other premitive datatypes string is a class (it has methods to manipulate texts and it is immutable).
	// if we create 2 objs and have same value then in string pool it refers to the same object so it enhance the perforamance
	//with memory optimization.
	//methods in string( equals, equalsIgnorecase, contains,starts with, ends with) 
	                 //(trim,toUpperCase,toLowerCase,length
	// Reverse a String
	public static void main(String[]args) {
		        String s = "SIRI";
		        StringBuilder reversed = new StringBuilder(s);
		        System.out.println("The reversed string is: " + reversed.reverse());
		    }
		}