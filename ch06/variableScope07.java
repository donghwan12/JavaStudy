package ch06;

public class variableScope07 {
	public static void methodA() {
		//System.out.println(number);
	}
	public static void methodB() {
		//int result=1; //지역변수 -영역이 선언된 곳에서만 사용 가능
	}

	public static void main(String[] args) {
		int number=3;

		//System.out.println(result);
		for (int i = 0; i <5; i++) {
			System.out.println(i);
		}
	}

}
