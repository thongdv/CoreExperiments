import java.util.Arrays;

public class SortArrayUsingBubbleSort {
    
    public static void main(String[] args) {
        int[] numbers = {4,6,5,9};
        boolean numbersSwithed;
        do{
            numbersSwithed = false;
            for (int i = 0; i <numbers.length-1; i++) {
                if(numbers[i+1] < numbers[i]){
                    int temp = numbers[i+1];
                    numbers[i+1]= numbers[i];
                    numbers[i] = temp;
                    numbersSwithed =true;
                }
                
            }
            
        }while(numbersSwithed);
        System.out.println("oyutput "+ Arrays.toString(numbers));
    }
}
