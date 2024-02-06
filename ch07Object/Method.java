package ch07Object;
//메서드의 실행 흐름
//MyMath mm=new Myath();	먼저 인스턴스를 생성한다.

//long value =mm.add(1L,2L) 메서드를 호출한다.

//long add(long a,long b){
//	long result=a+b;		
//	return result;
//}

//1.main 메서드에서 메서드 add를 호출한다. 인수 1L과 2L이 메서드 add의 매개변수 a,b에
//각각대입된다.

//2. 메서드 add의 괄호 {}안에 있는 문장들이 순서대로 수행된다.

//3. 메서드 add의 모든 문장이 실행되거나 return문을 만나면, 호출한 메서드(main메서드)로 되돌아와서
//이후의 문장들을 실행한다
class Mymath{
	long add(long a,long b) { 
		long result =a+b;
		return result;
	//  return =a+b; //위으 두줄을 이와같이 한줄로 간단히 할 수 있다.
		//작업을 마치면 호출한곳으로 돌아온다.
	}
	long max (long a,long b) {
		long result =0;
		if (a>b) {
			result=a;
		}else {
			result=b;
		}
		return result;
		
	}
	long substract(long a,long b) {return a-b;}
	long multiply(long a,long b) {return a*b;}
	double divide(double a,double b) {
		return a/b;
	}
}
public class Method {

	public static void main(String[] args) {
		Mymath mm=new Mymath();
		long result1=mm.add(5L, 3L); //add 메서드 호출
		long result2=mm.substract(5L,3L);
		long result3=mm.multiply(5L, 3L);
		double result4=mm.divide(5L, 3L);
		long result5=mm.max(5, 3); //둘중에 큰 값을 반환 하는 메서드
		
		System.out.println("add(5L,3L)="+result1);
		System.out.println("sbustract(5L,3L)="+result2);
		System.out.println("multiply(5L,3L)="+result3);
		System.out.println("divide(5L,3L)="+result4);
		System.out.println("max(5,3)="+result5);

	}

}


