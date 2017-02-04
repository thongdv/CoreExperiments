import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		removeDuplicates(new int[] { 4, 3, 2, 4, 9, 4 });
	}

	private static void removeDuplicates(int[] arrayWithDuplicates) {

		// Assuming all elements in input array are unique
		int noOfUniqueElements = arrayWithDuplicates.length;

		for (int i = 0; i < noOfUniqueElements; i++) {
			for (int j = i + 1; j < noOfUniqueElements; j++) {
				// If any two elements are found equal
				if (arrayWithDuplicates[i] == arrayWithDuplicates[j]) {
					// Replace duplicate element with last unique element
					arrayWithDuplicates[j] = arrayWithDuplicates[noOfUniqueElements - 1];
					// Decrementing noOfUniqueElements
					noOfUniqueElements--;
					// Decrementing j
					j--;
				}
			}
		}
		int[] arraywithoutDuplicates = Arrays.copyOf(arrayWithDuplicates, noOfUniqueElements);
		System.out.println(Arrays.toString(arraywithoutDuplicates));
	}
}
