package ch2;

import java.util.Scanner;

public class IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=0;
		
		System.out.println("점수를 입력하세요");
		Scanner scanner=new Scanner(System.in);
		score= scanner.nextInt();
		
		if (score>=90) {
			System.out.println("A학점");
		}else if(score>=80) {
			System.out.println("B학점");
		}else if(score>=70) {
			System.out.println("C학점");
		}else {
			System.out.println("D학점");
		}
		
		
	}

}
