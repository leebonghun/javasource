package ClassTest;

public class SubscriberInfo {
	//속성 ,아이디,패스워드,전화번호,주소
	private String id;
	private String pw;
	private String tel;
	private String address;
	
	public SubscriberInfo(String id, String pw, String tel, String address) {
		super();
		this.id = id;
		this.pw = pw;
		this.tel = tel;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
	
}
