package Ch19;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class C04ReaderMain2 {

	public static void main(String[] args) throws Exception {
		
		
		Reader fin=new FileReader("C:\\tmp_io\\test3.txt");
		StringBuffer buffer=new StringBuffer();
		long startTime=System.currentTimeMillis();
		Writer fout=new FileWriter("C:\\\\tmp_io\\\\test3.txt");
		
		char[] tmp=new char[1024];
		
		while(true) {
//			int data=fin.read();
			int data=fin.read(tmp);
			if(data==-1)
				break;
//			buffer.append((char)data);
//			System.out.print((char)data);
//			buffer.append(tmp);
			fout.write(tmp);
			fout.flush();
			buffer.append(tmp);
		}
		long eTime=System.currentTimeMillis();
		System.out.println("소요시간:"+(eTime-startTime)+"ms");
//		System.out.println(buffer);
		fin.close();

	}

}
