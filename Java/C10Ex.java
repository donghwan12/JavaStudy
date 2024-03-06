package Ch08;
class Tv{
	String brand;
	int year;
	int inch;
	Tv(String brand,int year,int inch){
		this.brand=brand;
		this.year=year;
		this.inch=inch;
	}
	void show(){
		System.out.printf("%s에서만든 %d년 %d인치",this.brand,this.year,this.inch);
	}
}

public class C10Ex {

	public static void main(String[] args) {
//		자바 클래스를 작성하는 연습을 해보자. 다음 main() 메소드를 실행하였을 때 예시와 같이 출력되도록 TV 클래스를 작성하라.
//
//	
		   Tv myTV = new Tv("삼성", 2024, 80); //LG에서 만든 2017년 32인치
		   myTV.show();
//	
//		LG에서 만든 2017년형 32인치 TV

	}

}
