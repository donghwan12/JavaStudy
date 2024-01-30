package ch5;

public class MultiArray {

	public static void main(String[] args) {
		//다차원 배열
		
		//소규모 영화관 자석
		//A1-a5
		//b1-b5
		//c1-c5
		
		String[] seatA= {"a1","a2","a3","a4","a5"};
		String[] seatB= {"b1","b2","b3","b4","b5"};
		String[] seatC= {"c1","c2","c3","c4","c5"};
		
		//3X5 크기의 2차원 배열
		String[][] seats= new String[][] {
			{"a1","a2","a3","a4","a5"},
			{"b1","b2","b3","b4","b5"},
			{"c1","c2","c3","c4","c5"}		
		};
		
		//b2의 자석
		System.out.println(seats[1][1]);
		
		//c5의자석
		System.out.println(seats[2][4]);
		
		//첫줄에는 3칸,둘째 줄에는 4칸 셋재줄에는 5칸
		String[][]seats2={
				{"A1","A2","A3"},
				{"B1","B2","B3","B4"},
				{"C1","C2","C3","C4","C5"}	
		};
		
		//a3에 접근하려면?
		System.out.println(seats2[0][2]);
		

	}

}
