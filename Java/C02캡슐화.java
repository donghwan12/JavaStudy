package Ch09;

class Engine{
//	기능
//	정보은닉 외부에서 볼수가없다.
	private void 흡입() {System.out.println("외부로부터 공기를 빨아들인다");}
	private void 압축() {System.out.println("가둔 공기를 압축시킨다");}
	private void 폭발() {System.out.println("일정 수준압축되면 폭발!");}
	private void 베기() {System.out.println("가스를 외부로 보낸다.");}
	
	public void EngineStart() { //public으로인해 외부로부터 정보열람가능하다.
		//
		//
		흡입();
		압축();
		폭발();
		베기();
	}
}

class Car{
	Engine engine;
	Car(){ //생성자
		engine=new Engine();
	}
	void run() {
		engine.EngineStart();
	}
}

public class C02캡슐화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar=new Car();
		myCar.run();

	}

}
