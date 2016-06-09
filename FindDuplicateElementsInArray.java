import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {
		String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
		Set<String> set = new HashSet<String>();
		for(String str : strArray){
			if(!set.add(str)){
				System.out.println("Duplicate Element is :"+ str);
			}
		}
	}
}
