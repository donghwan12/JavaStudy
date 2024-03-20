package Ch17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class C02SetMAin {

	public static void main(String[] args) {
		
		Set<String> set=new HashSet();
		set.add("Html/CSS/JS");
		set.add("JQUERY");
		set.add("NoDejs");
		set.add("SCSS");
		set.add("React");
		set.add("JAVA");
		set.add("JSP/Servelet");
		set.add("STS");
		set.add("Spring Boot");//삭제
		set.add("Spring Boot"); //삭제
		set.add("Spring Boot"); //추가
		
//		조회
//		중복허용이 안됨 기존에 있는것들이 삭제된다.
		System.out.println("개수 확인:"+set.size());
//		삭제
		set.remove("STS");
		System.out.println("개수 확인:"+set.size());
			
//		전체조회(Iterator)
		Iterator<String> iter= set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("======");
		for(String el:set) {
			System.out.println(el);
		}
	}

}
