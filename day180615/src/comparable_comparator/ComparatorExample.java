package comparable_comparator;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 에러 발생
		/*
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>();
		
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 6000));
		*/
		
		TreeSet<Fruit> treeSetD = new TreeSet<Fruit>(new DescendingComparator());
		
		treeSetD.add(new Fruit("포도", 3000));
		treeSetD.add(new Fruit("수박", 10000));
		treeSetD.add(new Fruit("딸기", 6000));
		
		Iterator<Fruit> iteratorD = treeSetD.iterator();
		
		while (iteratorD.hasNext()) {
			Fruit fruit = (Fruit) iteratorD.next();
			System.out.println(fruit.name + ":" + fruit.price);
			
		}
		
		System.out.println();
		
		TreeSet<Fruit> treeSetA = new TreeSet<Fruit>(new AscendingComparator());
		
		treeSetA.add(new Fruit("포도", 3000));
		treeSetA.add(new Fruit("수박", 10000));
		treeSetA.add(new Fruit("딸기", 6000));
		
		Iterator<Fruit> iteratorA = treeSetA.iterator();
		
		while (iteratorA.hasNext()) {
			Fruit fruit = (Fruit) iteratorA.next();
			System.out.println(fruit.name + ":" + fruit.price);
			
		}
		
	}

}
