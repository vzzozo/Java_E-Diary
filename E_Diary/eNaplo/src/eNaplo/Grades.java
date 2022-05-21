package eNaplo;

public class Grades {
	private String studentsId;
	private String grade;
	private String course;
	private String date;
	
	public String getStudentsId() {
		return studentsId;
	}
	public void setStudentsId(String studentsId) {
		this.studentsId = studentsId;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString(){
		return "\nStudent ID="+getStudentsId()+ " Grade:"+getGrade() + " Course:"+getCourse() + " Date: " +getDate();
	}
}
