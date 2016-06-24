public class ReverseStringInplace {

	public static void main(String[] args) {
		String str = "siva";
		String reverse = reverseTheString(str);
		System.out.println("original String "+ str);
		System.out.println("reverse String "+ reverse);
	}

	private static String reverseTheString(String str) {
		StringBuilder builder = new StringBuilder(str);
		int length = builder.length();
		for(int i=0 ; i< length/2; i++){
			char current = builder.charAt(i);
			int otherEnd = length-i-1;
			builder.setCharAt(i, builder.charAt(otherEnd));
			builder.setCharAt(otherEnd, current);
		}
		return builder.toString();
	}
}
