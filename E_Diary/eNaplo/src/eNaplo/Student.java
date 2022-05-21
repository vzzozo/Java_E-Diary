package eNaplo;

public class Student {
	private String id;
	private String login;
	private String name;
	private String password;
	private String stClass;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStClass() {
		return stClass;
	}
	public void setStClass(String stClass) {
		this.stClass = stClass;
	}
	@Override
	public String toString(){
		return "\nID="+getId()+ " Login:"+getLogin() + " Password:"+getPassword()+" Name:"+getName() +" Class:"+getStClass();
	}
}
