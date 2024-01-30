package ch5;

public class _04_MultiArrayLoop {

	public static void main(String[] args) {
		// 다차원배열 순회
		String[][] seats= new String[][] {
			{"a1","a2","a3","a4","a5"},
			{"b1","b2","b3","b4","b5"},
			{"c1","c2","c3","c4","c5"}		
		};
		
		for (int i = 0; i < 3; i++) { //세로기준
			for (int j = 0; j < 5; j++) {//가로
				System.out.print(seats[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("=========");
		String[][]seats2={
				{"A1","A2","A3"},
				{"B1","B2","B3","B4"},
				{"C1","C2","C3","C4","C5"}
		};
//		for (int i = 0; i < seats2.length; i++) { //세로기준
//			for (int j = 0; seats2[i].length < 5; j++) {//가로
//				System.out.print(seats2[i][j]+" ");
//			}
//			System.out.println();
//		}
		System.out.println("============");
		// 세로크기 10X가로크기 15에 해당하는영화관 좌석
		String [][] seats3= new String[10][15];
		String[]eng= {"A","B","C","D","E","F","G","H","I","J"};
		
		for (int i = 0; i < seats3.length; i++) { //세로
			for (int j = 0; j < seats3[i].length; j++) { //가로
				seats3[i][j]=eng[i]+(j+1);
			}
		}
		
		//표 구매
				seats3[7][8]="___";
				seats3[7][9]="___";
		//영화관 좌석 확인하기
		
		
		for (int i = 0; i < seats3.length; i++) { //세로기준
			for (int j = 0; j < seats3[i].length; j++) {
				System.out.print(seats3[i][j]+" ");
			}
			System.out.println();
		}
		
		//표 구매
		seats3[7][8]="___";
		seats3[7][9]="___";
	}

}
