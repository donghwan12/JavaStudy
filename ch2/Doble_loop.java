package ch2;

public class Doble_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이중 반복문
		
		//별찍기 -왼쪽
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------");
		
		//별 찍기 -오른쪽
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}
}
