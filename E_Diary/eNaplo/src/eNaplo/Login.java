package eNaplo;

import java.io.IOException;
import java.util.List;

public class Login {
	public static Teacher teacherLogin(String loginName) throws IOException {
		List<Teacher> teachersList= Reader.teachersReader();
		
		for(Teacher t : teachersList)
		{
			if(t.getLogin().equals(loginName))
			{
				return t;
			}
		}
		return null;
	}
	
	public static Student studentLogin(String loginName) throws IOException {
		List<Student> studentsList = Reader.studentsReader();
		
		for(Student s : studentsList)
		{
			if(s.getLogin().equals(loginName))
			{
				return s;
			}
		}
		return null;
	}
}
