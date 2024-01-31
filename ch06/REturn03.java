package ch06;

public class REturn03 {
	//호텔 전화번호
	public static String getPhoneNumber() {
		String PhoneNumber="02-1234-5678";
		return PhoneNumber;
	}; 
	//호텔 주소
	public static String getAddress() {
		return "서울시 어딘가";
	};
	//호텔 액티비티
	public static String getActivities() {
		return "볼링장,탁구장,노래방";
	};
	
	public static void main(String[] args) {
		// 반환값 return
		String contactNumber=getPhoneNumber();
		System.out.println("호텔 전화 번호:"+contactNumber);
		
		String address=getAddress();
		System.out.println("호텔 주소:"+address);
		
		System.out.println("호텔 액티비티 :"+getActivities());
	}

}
