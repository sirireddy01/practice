package basicJava;

public class Stringprogram2 {
	//Count the Number of Words in a String
		public static void main(String[]args) {
			String s= "SIRI is  a girl";
			String[] words= s.split("\\s+");
			System.out.println("Number of words:"+ words.length);
		}
	}

}
