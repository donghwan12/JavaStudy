package Ch16;
class animal2{}
class Tiger extends animal2{
	String name;
//	생성자
	public Tiger(String name) {
		super();
		this.name = name;
	}	
//	toSTring
	@Override
	public String toString() {
		return "Tiger [name=" + name + "]";
	}
}
class Panda extends animal2{
	String namie;
//	생성자
	public Panda(String namie) {
		super();
		this.namie = namie;
	}
//	toSTring
	@Override
	public String toString() {
		return "Panda [namie=" + namie + "]";
	}
}

public class C04GenericMain {
	
//	Generic
	public static <T extends animal2> void PrintInfo(T[] arr) {
		for(T el:arr)
			System.out.println(el);
	}
//	Object
	public static void PrintInfo2(Object[] arr) {
		for(Object el:arr) {
			System.out.println(el);
			if(el instanceof Tiger) {
				Tiger down=(Tiger)el;
			}
		}
	}
	public static void main(String[] args) {
		Tiger[] arr= {new Tiger("백호"),new Tiger("시베리안 호랑이"),new Tiger("산군")};
		PrintInfo(arr);
		Panda[] arr2= {new Panda("푸바오"),new Panda("후이바오"),new Panda("루이바오")};
		PrintInfo(arr2);
		Object []arr3= {new Tiger("산군"),new Panda("후이바오")};
//		PrintInfo(arr3);
		PrintInfo2(arr3);
		
	}

}
