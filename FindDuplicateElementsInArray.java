import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementsInArray {

	//best method
	public static void main(String[] args) {
		String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
		Set<String> set = new HashSet<String>();
		for(String str : strArray){
			if(!set.add(str)){
				System.out.println("Duplicate Element is :"+ str);
			}
		}
	}
	
	//bruteforcemethod
	/*
	public static void main(String[] args) 
    {
        String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
 
        for (int i = 0; i < strArray.length-1; i++)
        {
            for (int j = i+1; j < strArray.length; j++)
            {
                if( (strArray[i].equals(strArray[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+strArray[j]);
                }
            }
        }
    }   
    */ 
}
