package ch2;

import java.util.Iterator;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//break
		int max=20;
		for (int i = 1; i <=50; i++) {
			System.out.println(i+"번 손님 주문하신 제품나왔습니다");
			if(i == max) {
				System.out.println("금일재료는 모두 소진 되었습니닼");
				break;
			}
		}
		//continue
		
		
	}

}
