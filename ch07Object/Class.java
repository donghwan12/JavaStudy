package ch07Object;

//클래스의 정의
//1.변수 -하나의 데이터를 저장할 수 있는 공간
//2.배열 -같은 종류의 여러 데이터를 하나로 저장할 수 있는 공간
//3.구조체 -서로 관련된 여러 데이터(다른타입)를 하나로 저장할 수 있는 공간
//4.클래스 -데이터 와함수의 결합(구조체+함수)
//
//사용자 정의 타입- 원하는 타입을 직접 만둘 수 있다.
//ex) int hour;
//     int minute;
//     int secontd;
//cass Time{
//	int horur;
//	int minute;
//	int second;
//}
//Time t=nuew Time();
public class Class {
	public static void main(String args[]) {
		Tv t;
		t=new Tv();
		t.channel =7;
		t.channelDown();
		System.out.println("현재 채널은"+t.channel+"입니다");
		
		
	}
}

class Tv{
	// Tv의 속성
	String color;	//색상
	boolean power;	//전원상태
	int channel;	//채널
	
	//Tv의 기능(메서드)
	void power() {power=!power;} //TV를 켜거나 끄는 기능을 하는 메서드
	void channelUp() {++channel;} //TV의 태널을 높이는 기능을 하는 메서드
	void channelDown() {--channel;} //TV의 채널을 낮추는 기능을 하는 메서드
	}