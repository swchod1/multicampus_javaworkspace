package array;




public class ArrayEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*String abc[] = new String[4];
		
		abc[0] = "asdas";*/
		
		String strSrc[] = {// 배열 원본
				new String("test1"),
				new String("test2"),
				new String("test3"),
		};
		
		String strDest[] = new String[strSrc.length+2];
		
		System.arraycopy(strSrc, 0, strDest, 2, 3);
		
		System.out.print("strSrc(원본) : ");
		for(String str : strSrc) {
			System.out.print(str + " ");
		}
		
		System.out.println();
		
		System.out.print("\nstrDest(복사본 : ");
		for(String str : strDest) {
			System.out.print(str + " ");
		}

	}

}
