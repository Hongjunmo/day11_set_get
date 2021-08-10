package day11_set_get;

public class Quiz01_class {
	private String id=null,pw=null;
	
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	
	public void login(String id , String pw) {
		if(id.equals((this.id))&&pw.equals(this.pw)) {
			System.out.println("인증 통과");
		}else {
			System.out.println("인증 실패");
		}
		
	}
	public void signUp(String id, String pw) {
		if(id.equals(this.id)==false) {
			setId(id);
			setPw(pw);
			System.out.println("저장 완료");
		}else {
			System.out.println("중복 아이디");
		}
	}
	
	
	
	
	
	
}
