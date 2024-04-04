package Ch37.Domain.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import Ch37.Domain.dao.MemberDao;
import Ch37.Domain.dao.SessonDaoImpl;
import Ch37.Domain.dto.MemberDto;
import Ch37.Domain.dto.SessionDto;

public class MemberServiceImpl {
	
	private MemberDao dao;
	private List<Integer> SessionIdList;
	private BCryptPasswordEncoder a;
	private SessonDaoImpl sdao;
	private SessionDto dto;

	public MemberServiceImpl() throws Exception{
		dao=new MemberDao();
		a= new BCryptPasswordEncoder();
		SessionIdList= new ArrayList();
		sdao=new SessonDaoImpl();
		
//		접속중인 sessionid를 session테이블에서 list로저장을하기
		List<SessionDto> tmplist=sdao.selectAll();
		for(SessionDto dto:tmplist) {
			SessionIdList.add(dto.getSessionId());
		}
	}
	public boolean memberRegister(MemberDto dto)throws Exception{ //회원 등록
		
		String encrypt= a.encode(dto.getPw());
		dto.setPw(encrypt);
		return dao.insert(dto);
	}
	public boolean memberUpdate(MemberDto dto)throws Exception{ //회원 업데이트
		return dao.update(dto);
	}
	public boolean memberDelete(MemberDto dto)throws Exception{ //회원 삭제
		return dao.delete(dto);
	}
	public List<MemberDto> getAllmembers()throws Exception{ //회원 조회
		return dao.SelectAll();
	}
	public MemberDto getMember(String username)throws Exception{
		return dao.select(username);
	}

//	로그인 서비스
	public Map<String,Object>login(String username,String password,int SessionId)throws Exception{
		
		Map<String,Object> result=new HashMap();
		
//		1.sessionlist에 동일한 세선졍보가있는가??
		for(int id:SessionIdList) {
			if(SessionId==id) {
				result.put("response",false);
				result.put("msg", "이미 해당 게정은 로그인한 상태입니다.");
				return result;
			}
		}
//		2.로그인 상태가 아니라면 user테이블로부터 동일한 이름의 user정보를 가져오기
		MemberDto savedUser=getUser(username);
		if(savedUser==null) {
			result.put("response", false);
			result.put("msg", "동일 계정이 존재 하지 않습니다.");
		}
		return null;
	}
	
	
	private MemberDto getUser(String username) throws Exception{
		return dao.select(username);
	}
	
	
	
}
