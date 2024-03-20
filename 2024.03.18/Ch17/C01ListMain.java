package Ch17;

import java.util.ArrayList;
import java.util.List;

public class C01ListMain {

	public static void main(String[] args) {
			
		List<String> list=new ArrayList();
//		추가
		list.add("Html/CSS/JS");
		list.add("JQUERY");
		list.add("NoDejs");
		list.add("SCSS");
		list.add("React");
		list.add("JAVA");
		list.add("JSP/Servelet");
		list.add("STS");
		list.add("Spring Boot");
		list.add("Spring Boot");
//		조회
		System.out.println("개수 확인:"+list.size());
		System.out.println("idx로 조회: "+list.get(2));
		System.out.println("Value로 idx확인: "+list.indexOf("STS"));
//		삭제
		list.remove(0);
		list.remove("STS");
		for(String el:list)
			System.out.println(el);
//		전체삭제
		list.clear();
		
	}

}
