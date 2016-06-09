/**
 * Java Program to reverse Each word of the String
 *
 */
public class ReverseEachWordOfString {

	public static void main(String[] args) {
		String str = "Birds can fily";
		String reverseStr = "";
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord+ word.charAt(j);
			}
			reverseStr = reverseStr + reverseWord+ " ";
		}
		
		System.out.println("Original String : "+ str);
		System.out.println("Reverse String : "+ reverseStr);
	}
}
