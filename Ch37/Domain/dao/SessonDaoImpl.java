package Ch37.Domain.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Ch37.Domain.dto.SessionDto;

public class SessonDaoImpl {
	
//	Db연결한다
	private String url ="jdbc:mysql://localhost:3306/bookdb";
	private String id = "root";
	private String pw = "1234";
	
	private Connection conn =null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public SessonDaoImpl() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url,id,pw);
		System.out.println("[DAO] SessionDaoImpl's INIT DB Connected...");
		
		
	}
//	session 용 insert
	public boolean insert(SessionDto dto) throws Exception{
		//쿼리문 작성
		pstmt=conn.prepareStatement("insert into session values(null,?,?)");
		pstmt.setString(1, dto.getName());
		pstmt.setString(2, dto.getRole());
		int result =pstmt.executeUpdate();	
		return result>0;
	}
	
//	session 용 select id로 찾기
	public SessionDto select(int sessionid) throws Exception {
		pstmt=conn.prepareStatement("select *from session where id=?");
		pstmt.setInt(1, sessionid);
		rs=pstmt.executeQuery();
		SessionDto dto=null;
		if(rs!=null) {
			rs.next();
			dto=new SessionDto();
			dto.setName(rs.getString("name"));
			dto.setSessionId(rs.getInt("id"));
			dto.setRole(rs.getString("role"));
		}
		return dto;
	}
	
//	selcet All 
	public List<SessionDto> selectAll() throws Exception{
		pstmt=conn.prepareStatement("select *from session");
		rs=pstmt.executeQuery();
		List<SessionDto> list=new ArrayList();
		SessionDto dto=null;
		if(rs!=null) {
			while(rs.next()) {
				dto=new SessionDto();
				dto.setName(rs.getString("name"));
				dto.setSessionId(rs.getInt("id"));
				dto.setRole(rs.getString("role"));
				list.add(dto);
			}
		}
		rs.close();
		pstmt.close();
		return list;
	}
//	session 로그아웃시 delete 삭제용 
}
