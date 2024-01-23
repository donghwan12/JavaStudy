package hello;

import java.util.Scanner;



public class IF문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score=101;
		if (60<=score && score<100) {
			System.out.println("합격입니다.");
		}
		else {
			System.out.println("불합격입니다");
		}
	Scanner score1=new Scanner(System.in);
		System.out.println();
		
	int input;
		
	System.out.println("숫자를 입력하세요>");
		String tmp=score1.nextLine();
		input=Integer.parseInt(tmp);
		
		if (input==0) {
			System.out.println("입력하신 숫자는 0입니다.");
			
		}
		else {
			System.out.println("입력하신숫자는 0이 아닙니다");
			System.out.println("입력하신 숫자는"+input+"입니다.!");
		}
		int scr;
		char grade;
		
		System.out.println("점수를 입력하세요>");
		
		String x=score1.nextLine();
		scr=Integer.parseInt(x);
		
		if (scr>=90) {
			grade='a';
		}
		else if(scr>=80) {
			grade='b';
		}
		else if(scr>=70) {
			grade='c';
		}
		else {
			grade='d';
		}
		System.out.println("당신의 학점은"+grade+"입니다.");

	}

}
