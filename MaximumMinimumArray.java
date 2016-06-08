import java.util.Arrays;

/**
 * Java program to find maximum and minimum numbers in given array
 * 
 *
 */
public class MaximumMinimumArray {

	public static void main(String[] args) {
		int numbers[] = {1,2,3,4,5,6,7};
		findMaxAndMin(numbers);
	}

	private static void findMaxAndMin(int[] numbers) {
		int smallest = numbers[0];
		int largest = numbers[0];
		
		for (int i : numbers) {
			if(i > largest){
				largest = i;
			}else if(i <smallest){
				smallest = i;
			}
		}
		
		System.out.println("Given integer array :"+Arrays.toString(numbers));
		System.out.println("larget number : "+ largest);
		System.out.println("smallest number : "+ smallest);
		
	}
}
