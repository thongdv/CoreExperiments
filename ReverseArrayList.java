import java.util.ArrayList;
import java.util.List;

/**
 * Java Program to reverse ArrayList in place
 *
 */
public class ReverseArrayList 
{
    public static void main( String[] args )
    {
        List<String> listOfFood  = new ArrayList<String>();
        listOfFood.add("Beans");
        listOfFood.add("Soup");
        listOfFood.add("Dark Chocolate");
        listOfFood.add("Yogurt");
        listOfFood.add("Sausage");
        listOfFood.add("Pure Vegetables");
        listOfFood.add("Nuts");
        
        System.out.println("Origibal Array : "+ listOfFood);
        
        int size = listOfFood.size();
        
        for(int i=0 ; i< size/2 ; i++){
        	String tmp = listOfFood.get(i);
        	listOfFood.set(i, listOfFood.get(size-i-1));
        	listOfFood.set(size-i-1, tmp);
        }
        
        System.out.println("Reversed ArrayList : "+ listOfFood);
    }
}
