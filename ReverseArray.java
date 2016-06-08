import java.util.Arrays;

/**
 *
 * Java program to demonstrate how reverse of a Array in place
 */
public class ReverseArray {
    
    public static void main(String[] args) {
        int input[] = {1,2,3,4,5,6,7};
        reverse(input);
    }

    /**
     * Reverse  given array in place
     * @param number 
     */
    private static void reverse(int[] input) {
        System.out.println("Original Array : "+ Arrays.toString(input));
        
        //handling null
        if(input == null || input.length <=1 ){
            return;
        }
        
        for (int i = 0; i < input.length/2; i++) {
            int tmp = input[i]; //swap numbers
            input[i]= input[input.length-1-i];
            input[input.length-1-i]= tmp;
            
        }
        
        System.out.println("Reverse Array : "+ Arrays.toString(input));
    }
}
