package Ch17;

import java.util.HashMap;
import java.util.Map;

class AuthController{
//	id/pw 저장
	private static Map<String,Integer> map=new HashMap();
	
//	CRUD
	public static boolean Insert(String ID,Integer pw) {
		if(map.containsKey(ID)) {
			System.out.println("[ERRor]동일한 아이디가 존재합니다.");
			return false;
		}
			
		map.put(ID, pw);
		return true;
		}
	public static void Select(String Id) {
		System.out.println("벨류값:"+map.get(Id));
	}
	
	public static void SelectAll() {
		for(String key:map.keySet())
			System.out.println("key :"+key +" values :"+map.get(key));
	}
	public static boolean Update(String id,Integer pw) {
		map.replace(id, pw);
		
		return true;
		}
	public static boolean delete(String id) {
		map.remove(id);
		
		return true;
		}
	
}
public class C04MapMain {

	public static void main(String[] args) {
//		Insert
		AuthController.Insert("aaaa", 1111);
		AuthController.Insert("bbbb", 2222);
		AuthController.Insert("bbbb", 2222); //중복
		AuthController.Insert("cccc", 3333);
		AuthController.Insert("dddd", 4444);
//		select
		AuthController.Select("cccc");
//		select all
		AuthController.SelectAll();

	}

}
