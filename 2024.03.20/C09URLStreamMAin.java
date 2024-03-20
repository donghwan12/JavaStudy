package Ch19;

import java.io.BufferedInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;

public class C09URLStreamMAin {

	public static void main(String[] args) throws Exception{
		URL url=new URL("https://sports.news.naver.com/news?oid=411&aid=0000043257");
		InputStream bin= url.openStream();
		
		BufferedInputStream buffin=new BufferedInputStream(bin); //보조 스트림 //바이트 단위로 파일을 읽어온다
																//버퍼 공간추가
		
		Reader in=new InputStreamReader(buffin);				//보조 스트림
																// byte단위->char단위로 변화해서 받음
		
		Writer out=new FileWriter("C:\\tmp_io\\index.html");
		while(true) {
			int data=in.read();
			if(data==-1)
				break;
			
			out.write((char)data);
			
		}
	}

}
