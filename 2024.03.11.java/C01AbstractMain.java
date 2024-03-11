package Ch13;

//일반클래스 상속관계
class Super1{
	void func1() {};
}
class son1 extends Super1{
	void func1() {System.out.println("Son1's Functino()");}
}
//추상클래스 상속관계
abstract class Super2{
	abstract void fucn();
}
class son2 extends Super2{

	@Override
	void fucn() {
		System.out.println("Son2's Fucntion()");
		
	}
	
}
abstract class Super3{
	abstract void fucn();
}
class son3 extends Super3{
	void fucn() {
		System.out.println("son'3 Fucnstion()");
	}
}
public class C01AbstractMain {

	public static void main(String[] args) {
//		01
		Super1 ob1=new Super1();//상위클래스형으로 객체생성가능
		son1 ob2=new son1();	//하위클래스로 객체생성
		
							//상위클래에서 추가된 메서드 접근 x
							//상위클래스에서 정의한 메서드를 하위클래에서 재정의한 경우 접근 o
		Super1 ob3=ob2; //Upcasting
		ob3.func1(); //재정의된 메서드가 출력
		System.out.println("============");
		
//		02
//		Super2 ob1=new Super2(); ->추상메서드라 객체생성이불가하다.
		son2 ob4=new son2(); //객체생성 o
		
		Super2 ob5=ob4; //Upcasting 가능하다.
		ob5.fucn(); 
		System.out.println("=============");
		
		son3 ob6=new son3();
		Super3 ob7=ob6;
		ob6.fucn();
		ob7.fucn();

	}

}
