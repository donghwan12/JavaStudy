package Ch20;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class C03DatainoutStreamMain {

	public static void main(String[] args) throws Exception {
		
//		FileOutputStream out =new FileOutputStream("C:\\tmp_io\\test3.txt");
//		DataOutputStream dout=new DataOutputStream(out);
//		dout.writeUTF("홍길동");
//		dout.writeDouble(90.5);
//		dout.writeInt(1234);
//		dout.flush();
//		dout.close();
		
		FileInputStream in=new FileInputStream("C:\\tmp_io\\test3.txt");
		DataInputStream din=new DataInputStream(in);
		String name=din.readUTF(); //순서를 맞춰서해야함 처음문자열로 작성했으면 먼저 문자열로 빼야한다
		System.out.println(name);
		double d=din.readDouble();
		System.out.println(d);
		int i=din.readInt();
		System.out.println(i);
		

	}

}
