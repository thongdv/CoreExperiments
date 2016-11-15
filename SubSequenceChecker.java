public class SubSequenceChecker {

	public static void main(String[] args) {
		
		String mainString = "Chemistry";
		String subString = "mst133123123123";
		boolean isSubSequence = isSubsequence(mainString, subString);
		System.out.println(isSubSequence);
	}

	private static boolean isSubsequence(String mainString, String subString) {
			
		if(subString.isEmpty()){ // if sunsring is empty then return ture
			return true;
		}
		
		int subStringIndex = 0;
		for(int i=0 ; i<mainString.length(); i++){ 
			/**
			 * iterate over main string, take first char of subString, and compare with main string, if match found
			 * then take the next char of substring, continue matching.
			 * if substring length = subsring index then return true
			 */
			if(mainString.charAt(i) == subString.charAt(subStringIndex)){ 
				++subStringIndex;
				
				if(subStringIndex == subString.length()){
					return true;
				}
			}
		}
		
		return false;
	}
	
}
