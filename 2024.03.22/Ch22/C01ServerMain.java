package Ch22;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C01ServerMain {
	

	public static void main(String[] args) throws Exception{

//		서버접속 준비
		ServerSocket server=new ServerSocket(7000); //192.168.254:6000
		System.out.println("[InFO]Server Socket Listening");
		
		while(true) {
			Socket client=server.accept();
			System.out.println("[INFO]"+client.getInetAddress()+" 접속하셨습니다.");
			OutputStream out=client.getOutputStream();
			DataOutputStream dou=new DataOutputStream(out);
			dou.writeUTF("WELLCOMe");
			dou.flush();
			dou.close();
			out.close();
			
			InputStream in=client.getInputStream();
			DataInputStream din=new DataInputStream(in);
			String recv=din.readUTF();
			
			
		}
	}

}
