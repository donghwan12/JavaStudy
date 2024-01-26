package ch2;

import java.util.Iterator;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//구구단
		
		for (int i = 2; i <=9; i++) {
			System.out.println("구구단"+i +"단입니다");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*"+ j+ "="+(i*j)+"입니다.");
			}
			System.out.println("----------");
		}
	}

}
