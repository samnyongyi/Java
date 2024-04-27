package school;

public class Phone {
	private String name, tel;
	public Phone(String name, String tel) {
		this.name=name; this.tel=tel;
	}
	public String getName() { return name;}
	public String getTel() {return tel;}
	public void setName(String n) {this.name=n;}
	public void setTel(String n) { this.tel=n;}
}
