package ch07Object;
//실행중인 메서드를 종료하고 호출한 곳으로 되돌아간다.
// void printgugudan(int dan){
//		if(!(2<= dan && dan>=9))
//			return; // dan의 값이 2~9가 아닌경우, 호출한 곳으로 그냥 되돌아간다.
//		for(int i=1,i<=9; i++){
//			system.out.printf("%d*%d=%d\n",dan,i,dan*i);
//				}
//			return; //반환타입이 void이므로 생략가능
//	}
//반환타입이 void가 아닌경우 ,반드시 return문 필요하다.
class gugudan{
	void printgugudan(int dan){
		if(!(2<= dan && dan<=9))
			return; //입력받은 단이 2~9가 아니면 메서드 종료하고돌아가기	
		for(int i=1;i<=9; i++){
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
			
		}
	}
}
public class REturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gugudan ab=new gugudan();
		ab.printgugudan(3);
		System.out.println();
		ab.printgugudan(12); //if문으로 인해 12단 출력 X
		ab.printgugudan(6);
		

	}

}
