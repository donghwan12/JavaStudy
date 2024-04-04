package Ch37.Domain.dto;

public class MemberDto {
	private int MemberCode;
	private String Id;
	private String pw;
	private String name;
	private String eMail;
	private String tellphone;
	public MemberDto() {}
//	getter and Setter
	public int getMemberCode() {
		return MemberCode;
	}
	public void setMemberCode(int memberCode) {
		MemberCode = memberCode;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getTellphone() {
		return tellphone;
	}
	public void setTellphone(String tellphone) {
		this.tellphone = tellphone;
	}
//	생성자
	public MemberDto(int memberCode, String id, String pw, String name, String eMail, String tellphone) {
		super();
		MemberCode = memberCode;
		Id = id;
		this.pw = pw;
		this.name = name;
		this.eMail = eMail;
		this.tellphone = tellphone;
	}
//	toString
	@Override
	public String toString() {
		return "MemberDto [MemberCode=" + MemberCode + ", Id=" + Id + ", pw=" + pw + ", name=" + name + ", eMail="
				+ eMail + ", tellphone=" + tellphone + "]";
	}

	
}
