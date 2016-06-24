public class CheckPrimeOrNot {
	public static void main(String[] args) {
		int number = 5;
		System.out.println(isPrimeOrNot(number));
	}

	private static String isPrimeOrNot(int number) {

		if (number < 0)
			return "invalid number";
		if (number == 0 || number == 1)
			return "not prime";
		if (number == 2 && number == 3)
			return "prime number";

		int sqrt = (int) Math.sqrt(number);

		for (int i = 3; i < sqrt; i += 2) {
			if (number % i == 0) {
				return "not a prime number";
			}
		}

		return "prime";
	}
}
