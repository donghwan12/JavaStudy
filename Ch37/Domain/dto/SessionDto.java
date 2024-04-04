package Ch37.Domain.dto;

public class SessionDto {
	private int sessionId;
	private String name;
	private String role;
	
	public SessionDto() {}
//	생성자
	public SessionDto(int sessionId, String name, String role) {
		super();
		this.sessionId = sessionId;
		this.name = name;
		this.role = role;
	}
//	To string

	@Override
	public String toString() {
		return "SessionDto [sessionId=" + sessionId + ", name=" + name + ", role=" + role + "]";
	}
//	getter and setter

	public int getSessionId() {
		return sessionId;
	}

	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
