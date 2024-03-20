package Ch19;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C01WriterMain {

	public static void main(String[] args) throws IOException {
		
//		Writer fout=new FileWriter("C:\\Users\\Administrator\\Downloads\\tmp.io\\test1.txt",false); //덮어쓰기
		Writer fout=new FileWriter("C:\\Users\\Administrator\\Downloads\\tmp.io\\test1.txt",true); //추가하기
		
		
		fout.write("hello World\n");
		fout.write("등운동할까\n");
		fout.write("하체운동할까\n");
		fout.write("가슴운동할까\n");
		fout.write("어꺠운동할까\n");
		fout.write("팔운동할까\n");
		fout.flush(); //출력 버퍼 공간 초기화
		fout.close(); //출력 스트림 닫기
	}

}
