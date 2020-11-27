package comparable_comparator;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Fruit> {
	
	
	@Override
	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		
		if(o1.price < o2.price) { // 가격이 적으면 뒤에 오게
			return 1;
		} else if(o1.price == o2.price) {
			return 0;
		} else { // 가격이 크면 앞에 오게
			return -1;
		}
		
	}
	
	

}
