package Ch12;
class Super{
	int n1;
}
class Sub extends Super{
	int n2;
}
public class C04UpDownCastingMain {

	public static void main(String[] args) {
//		NoCasting
		Super ob1=new Super();
		ob1.n1=0;
		Sub ob2=new Sub();
		ob2.n1=10;
		ob2.n2=20;
		
//		UpCasting
//		상위클래스 참조변수=하위클래스 객체
//		UpCasting은 자동형변환이 된다.
//		UpCasting은 상위클래스형으로 형변환을 하는 문법
		Super ob3=new Sub();//상위클래스 참조변수로 하위클래스를 연결
		ob3.n1=100;
		System.out.println(ob3.n1);
//		ob3.n2 //하위클래스에있는 n2에는 접근이 불가하다.즉 공간이 있는데 제한이 되어있다.
		
//		DownCasting:하위클래스 참조변수 =상위클래스형 객체
//		DownCasting은 하위클래스형으로 형변환을 시도하는 문법.
//		DongCasting은 강제형변환을 해야한다.
		Sub ob4=(Sub)ob3; //업캐스팅으로 받은 참조변수로 연결해야한다
		ob4.n1=100;
		ob4.n2=200;
		System.out.println(ob4.n1);
		System.out.println(ob4.n2);
	}

}
