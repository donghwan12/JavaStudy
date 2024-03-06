package Ch09;

//	접근 한정자
//	멤버의 접근범위를 제한을 위한 예약어
//	public 	:모든 클래스에서 접근가능
//	private	:해당 클래스에서만 접근가능
//	protected	:상속 관계를 가지는 경우에 접근가능
//	defalut(기본)	:동일 패키지에 속한 클래스에서 접근가능

//일반인	
//이름	//공개가능 //수정여부 O
//나이	//공개가능	//수정여부 O
//주소	//비공개	//수정여부 O
//성별	//공개가능	//수정여부 X
//학력	//비공개	//수정여부 O
//연봉	//비공개	//수정여부 O
//주민번호	//비공개	//수정여부 x

//연예인	
//이름	//비공개 //수정여부 O
//나이	//비공개	//수정여부 O
//주소	//비공개	//수정여부 O
//성별	//공개가능	//수정여부 X
//학력	//비공개	//수정여부 O
//연봉	//비공개	//수정여부 O
//주민번호	//비공개	//수정여부 x

class C01Person{
	private String name;
	private int age;
	private String addr;
	public C01Person(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
//	getter private를 받아오기 위한 함수
	String getName(){
		return this.name;
	}
	public String setName() {
		return this.name;
	}
//	Setter 수정하기위한 함수
	int getAge() {
		return this.age;
	}
	void setAge(int num){
		this.age=num;
	}
//	@Override
//	public String toString() {
//		return "C01Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
//	}
	
}
public class C01정보은닉 {

	public static void main(String[] args) {
		C01Person ob1=new C01Person("홍길동",55,"대구");
		System.out.println(ob1.getName());
		ob1.setAge(55);
		
	}

}
