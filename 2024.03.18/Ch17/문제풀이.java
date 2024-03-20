package Ch17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 문제풀이 {
	public static List<String> fucn1(List<String> list){
//		ArrayList에 있는 정수값을 입력받는데 전달되는 수중에
//		짝수의 값만 입력받는 코드를 작성하세요.
//		fucn3함수 완성하기
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<=5;i++) {
			System.out.println("값을 입력하세요: ");
			int num=Integer.parseInt(sc.next());
			if(num%2==0) {
				list.add(String.valueOf(num));
			}
		}
		System.out.println(list);
		return list;
	}

	public static List<String> func2(List<String> list) {
//		ArrayList에 있는 문자열 중에서 길이가 5보다큰 문자열만 필터링해서 리턴하는 함수를 만드세요
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<=5;i++) {
			System.out.println("2번쨰리스트 값을 입력하세요:");
			int num=Integer.parseInt(sc.next());
			if(num>5){
				list.add(String.valueOf(num));
			}
		}
		System.out.println(list);
		return null;
	}
	public static int func3(List<String> list) {
//		ArrayList에 있는 문자열 중에서 숫자형 데이터만 추출해서 합을 구해보세요
		int sum=0;
		for(String el:list) {
			sum+=Integer.parseInt(el);		
			}
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		List<String> li=new ArrayList<>();
		fucn1(li);
		List<String> li2=new ArrayList<>();
		func2(li2);
		List<String> li3=new ArrayList<>();
		func3(li3);
	}

}
