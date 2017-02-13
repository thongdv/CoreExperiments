public class BinarySearchExample {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        System.out.println(binarySearch(list, 7));
    }
    
    
    public static boolean binarySearch(List<Integer> numbers, Integer value) {

        if (numbers == null || numbers.isEmpty()) {
            return false;
        }
        
        Integer comparison = numbers.get(numbers.size()/2);
        
        if(value.equals(comparison)){
            return true;
        }
        
        if(value < comparison){
            return   binarySearch(numbers.subList(0, numbers.size()/2), value);
        }
        
        else{
            return binarySearch(numbers.subList(numbers.size()/2 +1 , numbers.size()), value);
        }
        
    }
}
