package Ch13;
class Tv1{
	int size;
	public Tv1(int size) {
		this.size=size;
		
	}
	protected int getSize() {return size;}
}
class ColorTv extends Tv1{
	int color;
//	int size;
	public ColorTv(int size,int color) {
		super(size);
//		this.size=size;
		this.color=color;
	}
	void Tv정보() {
		System.out.printf("%d인치 %d컬러",getSize(),this.color);
	}
	
}
class IPTv extends ColorTv{
	String Ip;
	public IPTv(String IP,int size, int color) {
		super(size, color);
		this.Ip=IP;
	}
	void IP주소() {
		System.out.println("나의 IP주소:"+this.Ip);
		super.Tv정보();
	}

public class C문제 {

	public static void main(String[] args) {
		Tv1 tv=new Tv1(0);
		ColorTv ctv=new ColorTv(32,1024);
//		IPTv iptv= new IPTv("192.12.38",32,2048);
		
		ctv.Tv정보();
//		iptv.IP주소();

	}

}
}
