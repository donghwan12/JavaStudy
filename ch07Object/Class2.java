package ch07Object;
//클래스 변수와 인스턴스 변수
//
//인스턴스 변수
//-개별 속성
//ex) String kind; //무늬
//     int number; //숫자
//
//클래스 변수
//-공통 속성
//static int width =100; //폭
//static int height =250; //높이
//
//class Card{
//	String kind; 
//	int number
//
//	static int width =100;
//	static int height =250;
//}
//Card c=new Card()
//c.kind ="heart";
//c.number=5;
//
//Card.width=200;
//Card.height=300;

class Card{
	String kind; 
	int number;

	static int width =100;
	static int height =250;
}
public class Class2 {

	public static void main(String[] args) {
		System.out.println("Card.Width="+Card.width);
		System.out.println("card.Height="+Card.height);

		Card c1=new Card();
		c1.kind="Heart";
		c1.number=7;
		
		Card c2=new Card();
		c2.kind="spade";
		c2.number=4;
		
		System.out.println("c1은"+c1.kind+","+c1.number+"이며, 크기는"+(Card.width)+","+(Card.height)+"입니다");
		System.out.println("c2은"+c2.kind+","+c2.number+"이며, 크기는"+(Card.width)+","+(Card.height)+"입니다");
		System.out.println("C1의 width 와 height를 각각 50,80으로 변경합니다");	
		
		Card.width=50; //cv 클래스변수
		Card.height=80; //cv 클래스변수
		
		System.out.println("c1은"+c1.kind+","+c1.number+"이며 크기는"+(c1.width)+(c1.height)+"입니다");
		System.out.println("c2은"+c1.kind+","+c2.number+"이며 크기는"+(c2.width)+(c2.height)+"입니다");
	}

	
}
