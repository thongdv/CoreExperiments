public class RemoveWhiteSpacesInString {
	public static void main(String[] args) {
		String str = "birds can fly";
		// using replace all;
		String strWithoutSpace = str.replaceAll("\\s", "");
		System.out.println(strWithoutSpace);
		
		//Without using replaceAll() method
		char[] strArray = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<strArray.length; i++){
			if((strArray[i]!= ' ') && (strArray[i] !='\t')){
				sb = sb.append(strArray[i]);
			}
		}
		System.out.println(sb);  
	}
}
