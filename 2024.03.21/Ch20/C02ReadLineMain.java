package Ch20;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;

public class C02ReadLineMain {

	public static void main(String[] args) throws Exception{
		
		Writer out=new FileWriter("C:\\tmp_io\\test2.txt");
		BufferedWriter bout=new BufferedWriter(out);
		PrintWriter pout=new PrintWriter(bout);
		
		pout.println("hello");
		pout.println("hello");
		pout.println("hello");
		pout.flush();
		pout.close();
		
//		Reader in=new FileReader("C:\\tmp_io\\test2.txt");
//		BufferedReader bin =new BufferedReader(in); 
//		while(true) {
//			String data=bin.readLine(); //엔터단위로 읽어온다
//			if(data==null)
//				break;
//			System.out.println(data);
//		}
//		
		
		
		
	}

}
