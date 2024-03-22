package Ch20;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

class Board implements Serializable{
	private static final long serialVersionID=1L;
	
	private int bno;
	private String title;
	private String contents;
	private String writer;
	private Date date;
//	모든 인자 생성
	public Board(int bno, String title, String contents, String writer, Date date2) {
		super();
		this.bno = bno;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.date = date2;
//	getterSetter	
}
public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date2) {
		this.date = date2;
	}
//	to String
	
public class C04ObjectStreamMain {

	@Override
	public String toString() {
		return "C04ObjectStreamMain []";
	}

	public static void main(String[] args)throws Exception{
		FileOutputStream out =new FileOutputStream("c:\\tmp_io\\board4.db");
		ObjectOutputStream oout=new ObjectOutputStream(out);
		
		oout.writeObject(new Board(1,"제목1","하2","홍길동",new Date()));
		oout.writeObject(new Board(2,"제목2","하3","홍길동",new Date()));
		oout.flush();
		oout.close();
		out.close();
		
//		FileInputStream in =new FileInputStream("c:\\tmp_io\\board4.db");
//		ObjectInputStream oin=new ObjectInputStream(in);
//		
		
		
		
	}

}
}
