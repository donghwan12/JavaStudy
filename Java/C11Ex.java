package Ch08;

import java.util.Scanner;

class Avg{
	int math;
	int eng;
	int korean;
	int avg=0;
	void grade(int math,int eng,int korean) {
		this.math=math;
		this.eng=eng;
		this.korean=korean;
		this.avg=(math+eng+korean)/3;
	}
}

public class C11Ex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		Grade 클래스를 작성해보자. 
//		3 과목의 점수를 입력받아 Grade 객체를 생성하고 성적 
//		평균을 출력하는 main()과 실행 예시는 다음과 같다.
		System.out.println("수학 영어 국어순으로 성적을 입력하세요");
		int math=sc.nextInt();
		int eng=sc.nextInt();
		int korean=sc.nextInt();
		
		Avg a=new Avg();
		a.grade(math, eng, korean);
		System.out.printf("세과목의 평균 값은 %d입니다.",a.avg);
	} 

}
