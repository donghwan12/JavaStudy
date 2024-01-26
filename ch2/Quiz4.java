package ch2;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//주차요금은 시간당 4000원(일일 최대 요금은 3000원)
		//경차 또는 장애인 차량은 최종 요금에서 50%할인
		
		//일반 차량 5시간 주차시 20000원
		//경차 5시간 주차시 10000원
		//장애인 차량 10시간 주차시 15000원
		int hour;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("시간을 입력하세요");
		hour=scanner.nextInt();
		boolean smallCar= true;
		boolean DisableCar= false;
		
		int cost= hour * 4000;
		
		if (cost>30000) {
			cost=30000;
		}
		
		if (smallCar || DisableCar) {
			cost = cost /2;
		}
		
		System.out.println("주차 요금은"+cost+"입니다");
	}

}
