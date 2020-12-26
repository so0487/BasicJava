package i_collection;

import java.lang.Character.Subset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection_Set {
	public static void main(String[] args) {
		//1. Set 객체를 만들고 Generic타입은 Integer로 하여라 (변수명 set)
		Set<Integer>set  = new HashSet<>();
		//2. 1~45사이의 임의의 값으로 set변수를 6번 채워주세요.
		
		
		//set에 담긴 객체가 6개 될 때 까지?--> set.size()<6
		
		while(set.size()<6){
			int random = (int)(Math.random()*45+1);
			boolean result = set.add(random);
			System.out.println(result);
		}
		System.out.println(set);
		
		
		
		//3. 정렬
		
		List<Integer> list = new ArrayList<>();
		
		list.add(5);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(4);
		
		System.out.println(list);		//5,2,3,1,4 출력
		
		Collections.sort(list);
		System.out.println(list);		//1,2,3,4,5 출력
		
		List<Integer>list2 = new ArrayList<>(set);
		Collections.sort(list2);
		System.out.println(list2);
		
			
		
	}


}
