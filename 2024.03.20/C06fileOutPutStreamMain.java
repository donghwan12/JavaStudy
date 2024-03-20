package Ch19;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class C06fileOutPutStreamMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		OutputStream out=new FileOutputStream("C:\\tmp_io\\test4.xlsx");
		
//		byte 단위로 넣어야되기 때문에 이런 '가'- char 형식으론 안된다.
		out.write("가".getBytes(StandardCharsets.UTF_8));
		out.write('b');
		out.write('c');
		out.write('d');
		out.flush();
		out.close();
		
	}

}
