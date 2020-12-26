package i_collection;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Collection_List {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		
		
		list1.add(new Integer(1));
		list1.add(new Integer(2));
		list1.add(new Integer(3));
		list1.add(new Integer(4));
		list1.add(new Integer(5));
		list1.add(6);		//auto-boxing 발생
		list1.add(7);		//auto-boxing 발생
		list1.add(8);		//auto-boxing 발생
		
		
//		List<Integer>list2 = new ArrayList<>(list1);
//		
//		System.out.println(list1);
//		System.out.println(list2);
		//2개의 답이 동일 ---> toString()이 오버라이드 되어 있다.
		
		List<Integer>list2 = new ArrayList<>(list1.subList(2, 5));
		System.out.println(list1);
		System.out.println(list2);		//3,4,5출력
		
		//Create
		list2.add(9);
		System.out.println(list2);		//3,4,5,9출력
		
		list2.add(2, 90);
		System.out.println(list2);		//3,4,90,5,9 출력
		
		list2.add(5, 90);
		System.out.println(list2);		//에러발생----> 더 이상 추가할 수 없다.(list2크기 보다 큰 index번째 숫자를 넣을 수 없다.)
		
		//Read
		Integer re = list2.get(2);
		System.out.println(re);			//90출력
		
		//Update
		list2.set(2, 70);
		System.out.println(list2);		//3,4,70,5,9,90 출력
		
		//Delete
		list2.remove(3);
		System.out.println(list2);		//3,4,70,9,90출력
		
		list2.remove(new Integer(3));
		System.out.println(list2);		//4,70,9,90출력
		
		
		
			
		
	}
	
}
