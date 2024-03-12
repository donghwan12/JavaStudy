package Ch14;
class C02SImple{
	int n;
	C02SImple(int n){
		this.n=n;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof C02SImple) {
			C02SImple down=(C02SImple)obj; //다운캐스팅
			return this.n==down.n;
		}
		return false;
	}
	
}

public class C02ObjectEqulas {

	public static void main(String[] args) {
		C02SImple ob1=new C02SImple(10);
		C02SImple ob2=new C02SImple(10);
		C02SImple ob3=new C02SImple(30);
		
		System.out.println(ob1.equals(ob2)); //ture
		System.out.println(ob1.equals(ob3)); //false 
//		만들어진객체가 다 다르기떄문에 false
		
		String str1=new String("Java");
		String str2=new String("Java");
		str1.equals(str2);
	}

}
