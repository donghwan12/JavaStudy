package Ch22;



import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class C01ClientMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Socket client=new Socket("192.168.2.254",7000);
		System.out.println("[InFo] server와 연결완료..");
		
		InputStream in=client.getInputStream();
		DataInputStream din=new DataInputStream(in);
		String msg=din.readUTF();
		System.out.println("[Server]"+msg);
		
		OutputStream out=client.getOutputStream();
		DataOutputStream dout=new DataOutputStream(out);
		dout.writeUTF("adfa");
		dout.flush();
		dout.close();
		out.close();
		
		din.close();
		in.close();
		
	}

}
