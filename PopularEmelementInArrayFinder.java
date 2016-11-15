package sivateja.core;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

public class PopularEmelementInArrayFinder {

	public static void main(String[] args) {
		
		int [] array = {1,5,8,4,5,8,4,5,8,8,5,8,5,8,5,4,1,4,2,5,2,6,8,4,2,5,8,2};
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < array.length; i++) {
			Integer count = map.get(array[i]);
			map.put(array[i], count != null ? count+1 :0);
		}
		
		 Entry<Integer,Integer> entry= Collections.max(map.entrySet() , new Comparator<Entry<Integer, Integer>>() {

			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return  o1.getValue().compareTo(o2.getValue());
			}
		});
		 
		 int popularValueInArray = entry.getKey();
		System.out.println(map);
		System.out.println("popilar value in given array is "+ popularValueInArray);
		
		
	}
}
