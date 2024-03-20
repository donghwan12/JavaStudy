package Ch19;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.UUID;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class C10JsoupMain {
	

	public static void main(String[] args) throws Exception{
		
		//url연겨ㅓㄹ
//		Connection conn=Jsoup.connect("https://www.op.gg/champions");
		Connection conn=Jsoup.connect("https://www.musinsa.com/categories/item/018003");

		//dom객체가져오기
		Document document=conn.get();
//		System.out.println(document);
		
//		img태그 받아오기
		Elements elements =document.getElementsByTag("img");
//		System.out.println(elements.size());
		
//		src값 추출하기
		String img_url=null;
		
		for(Element el:elements) {
			System.out.println(el.getElementsByAttributeStarting("src").attr("src"));
			img_url=el.getElementsByAttributeStarting("src").attr("src");
			
			System.out.println(img_url.indexOf("//"));
			if(img_url.indexOf("//")==0) {
				img_url="https:"+img_url;
			}
			URL url=new URL(img_url);
			InputStream in=url.openStream();
			BufferedInputStream bin=new BufferedInputStream(in); //byte 단위로 파일 내용을 가져ㅣ옴
			FileOutputStream out=new FileOutputStream("C:\\tmp_io"+UUID.randomUUID().toString()+".png");
			
			byte[] buffer=new byte[4096]; //byte 단위라 받기 때문에 배열 생성 
			int data=0;
			while(true) {
				data=bin.read(buffer);
				if(data==-1)
					break;
				out.write(buffer,0,data);
				out.flush();
				
			}
			bin.close();
			out.close();
			in.close();
			
			
			
		}
		

	}

}
