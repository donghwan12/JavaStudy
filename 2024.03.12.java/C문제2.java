package Ch13;

import java.util.Scanner;

abstract class Convert{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString(); // 추상 메소드
	 protected double ratio; // 비율
	   public void run() {
	      Scanner scanner = new Scanner(System.in);
	      System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
	      System.out.print(getSrcString()+"을 입력하세요>> ");
	      double val = scanner.nextDouble();
	      double res = convert(val);
	      System.out.println("변환 결과: "+res+getDestString()+"입니다");
	      scanner.close();
	   }
}
class Won2Dollar extends Convert{
	public Won2Dollar(double ratio){this.ratio=ratio;}
	@Override
	protected double convert(double src) {
		return src/ratio;
	}
	@Override
	protected String getSrcString() {
		return "원";
	}
	@Override
	protected String getDestString() {
		return "달러";
	}
}

public class C문제2 {

	public static void main(String[] args) {
		Won2Dollar dol=new Won2Dollar(1200);
		dol.run();

	}

}
