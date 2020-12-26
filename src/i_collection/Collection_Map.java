package i_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Collection_Map {
	public static void main(String[] args) {
		
		//1.Map객체를 만들어주세요
		//Generic타입은 String, Intger이다.
		//변수명은 params
		Map<String, Integer> params = new HashMap<>();
		
		//2.같은 팀의 이름은 key로 지정하고 자신이 주고 싶은 점수를 주세요
		//map추가 메서드는 put
		
		//Create
		params.put("의주", 50);
		params.put("철용", 60);
		params.put("수영", 70);
		params.put("대윤", 75);
		
		System.out.println(params);
		
		//Read
		int re1_1 = params.get("의주");
		int re1_2 = params.get("철용");
		int re1_3 = params.get("수영");
		int re1_4 = params.get("대윤");
		
		System.out.println(re1_1);
		System.out.println(re1_2);
		System.out.println(re1_3);
		System.out.println(re1_4);
		
		
		Set s = params.entrySet();
		System.out.println(s);
		
		Set sKey = params.keySet();
		System.out.println(sKey);
		
		for(int i=0;i<sKey.size();i++){
			System.out.println(params.get(sKey.toArray()[i]));
		}
		
		//Update
		params.put("수영", 90);			//--> 기존의 값에 새로운 값으로 put --> 값이 update된다.
		
		//JDK1.8에서는 가능
//		params.replace(key,value);					//해당하는 key가 없으면 false를 반환
//		params.replace(key,oldValue,newValue);		//key값과 oldValue 모두 맞아야 newValue로 변경	
		
		
		//Delete
		int re2 = params.remove("수영");
		System.out.println(re2);
	}

}
