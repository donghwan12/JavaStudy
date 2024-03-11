package Ch12;


class C06Super{
	void func1() {
		System.out.println("C06SUper Func1 호출");
	}
}
class C06Sub extends C06Super{
	void func1() {
		System.out.println("C06Sub Func1 호출");
	}
	void func2() {
		System.out.println("C06Sub Func2 호출(extneds...)");
	}
}
public class C06UpdonwCastingOverridingMain {

	public static void main(String[] args) {
		
		C06Super ob1=new C06Super();
		ob1.func1();
		
		C06Sub ob2=new C06Sub();
		ob2.func1();
		System.out.println("================");
		
		C06Super ob3=new C06Sub(); //upcasting
		ob3.func1();
//		ob3.fun2(); -->접근 x
		ob3.func1();//-> 하위 클래스 func1이 오버라이딩된다.
		
		
//		UpCasting
//		상위클래스 참조변수=하위클래스형객체
//		확장된(추가된)멤버변수 접근이 가능? x ->down캐스팅 필요
//		확장된(추가된)멤버메서드 접근가능? x ->down 캐스팅 필요
//		재정의된 메서드 접근 가능? o
	}

}
