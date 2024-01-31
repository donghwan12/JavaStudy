package ch06;

import java.util.Iterator;

public class Parameter02 {
	public static void power(int number) {
		int result =number *number;
		System.out.println(number+"의 2 승은"+result);
	}
	public static void powerByExp(int number,int exponent) {
		int result=1;
		for (int i = 0; i < exponent; i++) {
			result =result * number;
		}
		System.out.println(number+"의"+ exponent+"승은"+result);
	}
	public static void main(String[] args) {
		// 전달값,parameter
		//2>>2*2=4
		//3 ->3*3=9
		power(3); //number에 3이 전달된다
		power(4); //number에 4이 전달된다
		
		powerByExp(2,3); //number에 2 exponent에 3이 대입된다
		powerByExp(3,3); //number에 3 exponent에 3이 대입된다
	}

}
