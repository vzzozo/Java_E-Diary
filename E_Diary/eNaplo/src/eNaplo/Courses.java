package eNaplo;

public class Courses {
	private String schoolClass;
	private String name;
	private String teachersId;
	
	public String getSchoolClass() {
		return schoolClass;
	}
	public void setSchoolClass(String schoolClass) {
		this.schoolClass = schoolClass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeachersId() {
		return teachersId;
	}
	public void setTeachersId(String teachersId) {
		this.teachersId = teachersId;
	}
	
	@Override
	public String toString(){
		return "\nClass="+getSchoolClass()+ " Name:"+getName() + " teachersId:"+getTeachersId();
	}
}
