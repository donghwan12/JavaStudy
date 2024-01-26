package ch2;



public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i = 0; i <= 10; i++) {
			sum +=i;
			System.out.println(sum);
			
			
			//반복문 while
			//수영장에서 수영을 하는 모습
			int distance=25;//전체 거리 
			int move=0;
			while (move<distance) {
				System.out.println("발차기를 계속합니다");
				System.out.println("현재 이동거리"+move);
				move+=3; //3미터씩이동
			}
			System.out.println("도착하였습니다");
		}

	}

}
