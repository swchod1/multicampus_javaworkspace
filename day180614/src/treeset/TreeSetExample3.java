package treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");
		
		System.out.println("[c~f 사이의 단어 검색]");
		NavigableSet<String> rangeSet = treeSet.subSet("base", false, "f", true);
		
		// (첫 요소, 첫 요소 포함여부(이상 or 초과), 끝 요소, 끝 요소 포함여부(이하 or 미만))
		
		for(String word : rangeSet) {
			System.out.println(word);
		}

	}

}
