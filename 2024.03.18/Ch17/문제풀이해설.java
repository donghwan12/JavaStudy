package Ch17;

// 컬렉션 + 제너릭 문제
//https://security-nanglam.tistory.com/223

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 문제풀이해설 {

	static Scanner sc=new Scanner(System.in);
	
	public static void func1(List<String> list) {
		//ArrayList에 있는 정수값을 입력받는데 전달되는 수중에
		//짝수의 값만 입력받는 코드를 작성하세요.
		//func3함수 완성하기
		int tmp=0;
		while(true) {
			System.out.println("입력(종료-1): ");
			tmp=sc.nextInt();
			if(tmp==-1)break;
			else if(tmp%2==0) {
				list.add(String.valueOf(tmp));
			}
			else {
				System.out.println("[EXECPTION]짝수만 입력하세요");
			}
		}
		System.out.println("입력을마칩니다");
	}
	public static List<String> func2(List<String> list) {
		//ArrayList에 있는 문자열 중에서 길이가 5보다 큰 문자열만 필터링해서 리턴하는 함수를 만드세요
		return null;
	}
	public static int func3(List<String> list) {
		//ArrayList에 있는 문자열 중에서 숫자형 데이터만 추출해서 합을 구해보세요
		return 0;
	}
	public static void main(String[] args) {
		
		List<String> li = new ArrayList();
		func1(li);
		List<String> returndList =  func2(li);
		func3(returndList);
	}
}