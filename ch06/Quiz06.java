package ch06;

public class Quiz06 {
	public static String getHiddenData(String data,int index) {
		String hiddendata=data.substring(0,index); //나코딩-> 나
		for (int i = 0; i < data.length()-index; i++) {
			hiddendata +="*"; //나**
		}
		return hiddendata;
	}

	public static void main(String[] args) {
		String name="나코딩";
		String id="990130-1234567";
		String phone="010-1234-5678";
				
		System.out.println("이름:"+getHiddenData(name,1));
		System.out.println("주민등록번호"+getHiddenData(id,8));
		System.out.println("전화번호"+getHiddenData(phone,9));

	}

}
