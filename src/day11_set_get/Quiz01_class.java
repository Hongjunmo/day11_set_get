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
			System.out.println("���� ���");
		}else {
			System.out.println("���� ����");
		}
		
	}
	public void signUp(String id, String pw) {
		if(id.equals(this.id)==false) {
			setId(id);
			setPw(pw);
			System.out.println("���� �Ϸ�");
		}else {
			System.out.println("�ߺ� ���̵�");
		}
	}
	
	
	
	
	
	
}
