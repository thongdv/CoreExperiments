public class ReverseANumber {
	public static void main(String[] args) {
		int number = 13258;
		System.out.println(reverseNumber(number));
	}

	private static int reverseNumber(int number) {
		int remainder = 0;
		int reverse = 0;
		
		do{
			remainder = number%10;
			reverse = reverse*10 + remainder;
			number = number/10;
		}while(number >0 );
		
		return reverse;
	}
}
