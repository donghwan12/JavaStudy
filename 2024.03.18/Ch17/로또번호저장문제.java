package Ch17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class 로또번호저장문제 {

	public static void main(String[] args) throws InterruptedException {
//		1~45까지숫자를 6개를 랜덤으로 받아(random클래스를 이용) set에 저장
//		[추가]저장된 set의 오름차순정렬을 해보세요
		
		Set<Integer> set=new HashSet();
		Random rnd=new Random();
		
		while(set.size()>6)
			set.add(rnd.nextInt(45)+1);
		
		List<Integer> list=new ArrayList();
		Collections.sort(list);
		for(int num:list)
			System.out.println(num+" ");
		
		
		List<Integer> list2=
		set.stream()
			.sorted()
			.collect(Collectors.toList());
		for(int n:list2)System.out.println(n+" ");
	}

}
