package treeset;

import java.util.TreeSet;;

public class TreeSetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("가장 낮은 점수 : " + score);
		
		score = scores.last();
		System.out.println("가장 높은 점수 : " + score);
		
		score = scores.lower(new Integer(95));
		// 95점 미만이면서 95점에 가장 가까운 수 하나 
		System.out.println("95점 미만 점수 : " + score);
		
		score = scores.higher(new Integer(95));
		// 95점 초과이면서 95점에 가장 가까운 수 하나
		System.out.println("95점 초과 점수 : " + score);
		
		score = scores.floor(new Integer(96));
		// 96점 이하이면서 96점에 가장 가까운 수 하나
		System.out.println("95점 이상 점수 : " + score);
		
		score = scores.ceiling(new Integer(85));
		// 85점 이상이면서 85점에 가장 가까운 수 하나
		System.out.println("95점 이상 점수 : " + score);
		
		while (!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score + "(남은 객체 수 : " + scores.size() + ")");
			// pollFirst() : 제일 낮은 객체를 꺼내오고 컬랙션에서 제거함.
		}
		

	}

}
