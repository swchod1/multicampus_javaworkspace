package test01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totlaScore = 0;
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
		
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry =  iterator.next();
			totlaScore += entry.getValue();
			
			if(entry.getValue() > maxScore) {
				maxScore = entry.getValue();
				name = entry.getKey();
			}
		}
		
		System.out.println("평균 점수 : " + totlaScore/entrySet.size());
		System.out.println("최고 점수 : " + maxScore);
		System.out.println("최고 점수를 받은 아이디 : " + name);
		

	}

}
