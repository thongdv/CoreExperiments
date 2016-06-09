/**
 * Java Program to reverse words of string
 *
 */
public class ReverseStringWords {

	public static void main(String[] args) {
		String orginalString = "Birds can fily";
		String reverse = "";
		String []words = orginalString.split(" ");
		for(int i=words.length-1; i >=0; i--){
			reverse = reverse +" "+ words[i];
		}
		System.out.println("Original String : "+ orginalString);
		System.out.println("Reverse String : "+ reverse);
	}
}
