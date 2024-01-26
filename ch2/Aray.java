package ch2;

public class Aray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열:같은 자료형의 값 여러 개를 저장하는 연속된 공간
		String a="아메리카노";
		String b="카페모카";
		String c="카페라떼";
		String d="카푸치노";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		//배열 선언 첫번째 방법
		String[] coffees=new String[4];
		
		//두번째 방법
//		String coffees[]=new String[4];
		
		coffees[0]="아메리카노";
		coffees[1]="카페모카";
		coffees[2]="카페라떼";
		coffees[3]="카푸치노";
		
		System.out.println();
		
		//세번째 방법
		
		String[] coffees2=new String[] {"아메리카노","카페모카","카페라떼","카푸치노"};
		//네번째 방법
		
		String[] coffees3= {"아메리카노","카페모카","카페라떼","카푸치노"};
		
		System.out.println(coffees[0]+" 한잔이요");
		System.out.println(coffees[1]+" 한잔이요");
		
		System.out.println(coffees[3]+" 한잔이요");
		coffees[2]="에스프레소";
		System.out.println(coffees[2]+"한잔이요");
		
		
	}

}
