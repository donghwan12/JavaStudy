package Ch17;

import java.util.HashMap;
import java.util.Map;

public class C03MapMain {

	public static void main(String[] args) {

		Map<String,Integer> map=new HashMap();
		
//		추가
		map.put("aaa", 1234);
		map.put("bbb", 2222);
		map.put("ccc", 3333);
		map.put("ddd", 4444); //id 중복 ->삭제
		map.put("ddd", 5555); //id 중복
//		삭제
		map.remove("aaa");
//		개수확인
		System.out.println(map.size());
		
//		조회
		System.out.println(map.get("bbb"));
		
//		전체조회
		for(String key:map.keySet())
			System.out.println(key+" :"+map.get(key));
//								키값		벨류
	}

}
