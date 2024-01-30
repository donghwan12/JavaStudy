package ch5;

public class ArrayLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] coffees= {"아메리카노","카페모카","라떼","카푸치노"};
		
		//for 반복문
		for (int i = 0; i < 4; i++) {
			System.out.println(coffees[i]+"하나주세요");
		}
		
		//enhanced for 반복문
		//coffe 안에 coffees의 배열의 값들이 다담긴다
		System.out.println("========");
		for(String coffe:coffees) {
			System.out.println(coffe+"하나");
		}
	}

}
