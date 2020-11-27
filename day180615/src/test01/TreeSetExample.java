package test01;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Student01> treeSet = new TreeSet<Student01>();
		
		treeSet.add(new Student01("blue", 96));
		treeSet.add(new Student01("hong", 86));
		treeSet.add(new Student01("white", 92));
		
		Student01 student = treeSet.last();
		System.out.println("최고 점수 : " + student.score);
		System.out.println("최고 점수를 받은 아이디 : " + student.id);

	}

}
