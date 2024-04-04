package Ch37.main;

import Ch37.Domain.Service.MemberServiceImpl;
import Ch37.Domain.dao.MemberDao;
import Ch37.Domain.dto.MemberDto;

public class Main {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
//		FrontController frontController=new FrontController();
//		Map<String,Object>parmas=new HashMap();
//		parmas.put("MemberDto", new MemberDto(1,"yws078","1234","이동환", "yws078@naver.com", "010-8600-0787"));
//		frontController.execute("/member",1,parmas);
//		System.out.println();
		
		MemberDao dao=new MemberDao();
//		dao.insert(new MemberDto(1,"yws078","1234","이동환", "yws078@naver.com", "010-8600-0787"));
//		dao.insert(new MemberDto(2,"yw","1114","김동환", "rock78@naver.com", "010-1234-0787"));
//		dao.insert(new MemberDto(3,"078","1324","지동환", "yws078@daum.com", "010-5678-0787"));
//		dao.insert(new MemberDto(4,"asdf","1dfs","김흥국", "78@daum.com", "010-123478-0787"));
		
//		dao.update(new MemberDto(2, "alight", "7423", "박재훈", "allihght@naver.com", "010-1234-1441"));
//		dao.delete(new MemberDto(6,"asdf","1dfs","김흥국", "78@daum.com", "010-123478-0787"));
		MemberServiceImpl service=new MemberServiceImpl();
//		service.memberDelete(new MemberDto(1,"yws078","1234","이동환", "yws078@naver.com", "010-8600-0787"));
		
//		List<MemberDto>list =dao.SelectAll();
//		list.forEach(a->{
//			System.out.println(a);
//		});
		
//		FrontController frontController=new FrontController();
//		Map<String,Object>parmas=new HashMap();
//		parmas.put("MemberDto", new MemberDto(6,"asdf","1dfs","김흥국", "78@daum.com", "010-123478-0787"));
//		Map<String,Object> result=frontController.execute("/Member", 1, parmas);
//		Object response=result.get("response");
		
	}

}
