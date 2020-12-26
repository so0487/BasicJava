package i_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Collection_Iterator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("123");
		list.add("456");
		list.add("789");
		
		Iterator<String> it = list.listIterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		//Iterator의 경우 단방향 진행만 가능
		//ListInterator는 Iterator의 단점을 보완하기 위해서 나왔다.
		
		ListIterator<String>lit = list.listIterator();
		
		System.out.println(lit.hasNext());
		System.out.println(lit.next());
		System.out.println(lit.hasNext());
		System.out.println(lit.next());
		System.out.println(lit.hasNext());
		System.out.println(lit.next());
		
	}

}
