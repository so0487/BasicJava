package i_collection;

public class Collection_01 {
	public static void main(String[] args) {
		/*
		1.  collection framework
			- 의미
				: collection은 다수의 데이터(데이터 그룹)
				: framework(일하기 위한 틀)은 표준화된 프로그래밍 방식
		2. 핵심 인터페이스
			- List
				: 순서가 있다.
				: 데이터의 중복을 허용
				: 예)대기자명단
				: ArrayList, LinkedList, Stack, Vector 등
				 
			- Set
				: 순서가 없다.
				: 데이터의 중복을 비허용한다.
				: 예)양의 정수의 집합, 소수의 집합
				: HashSet, TreeSet		※tree : 검색용도로 사용
			- Map
				: key, value로 이루어져 있다.
				: 순서가 없다.
				: 키는 중복을 비허용하고 값을 중복 허용
				: 예)우편번호, 지역번호...
				: HashMap,TreeMap, Properties
				
		3. List
			- Vector와 ArrayList
				: Vector는 동기화를 보장(ArrayList는 동기화 보장X)
				: Object배열을 이용해서 데이터를 순차적으로 저장한다.
				: 배열이 커져서 기존 배열크기로 안될 때 새로운 배열을 만들고 기존 배열의 내용을 복사하여 준다.
			- LinkedList
				: 배열의 단점을 보완하기 위해서 만들어졌다.
				: 자신과 연결된 다음요소에 대한 주소값과 데이터로 이루어져 있다.
			- DoubleLinkedList
				: 자신과 연결된 이전요소의 주소값, 다음요소의 주소값, 데이터로 이루어져 있다.
			- Stack과 Queue
				: Stack -> LIFO(LastInFirstOut)
					저장 -> push()
					추출 -> pop()
					맨위 객체를 반환 -> peek()
					주어진 객체를 찾기 -> search()
				: Queue -> FIFO(FirstInFirtsOut)
					저장 -> offer()
					추출 -> poll()
			- Iterator, ListIterator
				: Iterator -> 컬렉션에 저장된 요소를 읽어오는데 사용
				
		4. Set
			- Set 인터페이스를 구현한 대표적인 구현체가 HashSet이다.
			- add메서드나 addAll메서드를 사용하는데 이미 저장된 요소가 있다면 추가에 실패하게 된다.
			- HashSet은 HashMap으로 만들어져 있다.
			    
		5. Map
			- Map인터페이스를 구현한 대표적인 구현체가 HashMap이다.
			- 키(key)와 값(value)의 한쌍으로 이루어져있다.
			- Map<Object,Object>타입이지만 key의 경우 일반적으로  String을 사용한다.
			- Key의 경우 유일해야 한다. 
				
		*/
	}

}
