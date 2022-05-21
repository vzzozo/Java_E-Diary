package eNaplo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {
	public static List<Student> studentsReader() throws IOException {
		
		BufferedReader reader = new BufferedReader(new FileReader("C:\\eNaplo\\CSV\\diakok.csv"));
		String line = null;
		Scanner scanner = null;
		int i= 0;
		List<Student> studentList = new ArrayList<>();

		try {
			while ((line = reader.readLine()) != null) {
				Student student = new Student();
				scanner = new Scanner(line);
				scanner.useDelimiter(",");
				while (scanner.hasNext()) {
					String data = scanner.next();
					if (i == 0)
						student.setId((data));
					else if (i == 1)
						student.setLogin(data);
					else if (i == 2)
						student.setPassword(data);
					else if (i == 3)
						student.setName(data);
					else if(i==4)
						student.setStClass(data);
					else
						System.out.println("invalid data::" + data);
					i++;
				}
				i = 0;
				studentList.add(student);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		reader.close();
		
		return studentList;
	}
	
	public static List<Teacher> teachersReader() throws IOException {
		
		BufferedReader reader = new BufferedReader(new FileReader("C:\\eNaplo\\CSV\\tanarok.csv"));
		String line = null;
		Scanner scanner = null;
		int i= 0;
		List<Teacher> teacherList = new ArrayList<>();

		try {
			while ((line = reader.readLine()) != null) {
				Teacher teacher = new Teacher();
				scanner = new Scanner(line);
				scanner.useDelimiter(",");
				while (scanner.hasNext()) {
					String data = scanner.next();
					if (i == 0)
						teacher.setId(data);
					else if (i == 1)
						teacher.setLogin(data);
					else if (i == 2)
						teacher.setPassword(data);
					else if (i == 3)
						teacher.setName(data);
					else
						System.out.println("invalid data::" + data);
					i++;
				}
				i = 0;
				teacherList.add(teacher);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		reader.close();
		
		return teacherList;
	}

	public static List<Courses> coursesReader() throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader("C:\\eNaplo\\CSV\\targyak.csv"));
		String line = null;
		Scanner scanner = null;
		int i= 0;
		List<Courses> coursesList = new ArrayList<>();

		try {
			while ((line = reader.readLine()) != null) {
				Courses course = new Courses();
				scanner = new Scanner(line);
				scanner.useDelimiter(",");
				while (scanner.hasNext()) {
					String data = scanner.next();
					if (i == 0)
						course.setSchoolClass(data);
					else if (i == 1)
						course.setName(data);
					else if (i == 2)
						course.setTeachersId(data);
					else if (i == 3)
						course.setName(data);
					else
						System.out.println("invalid data::" + data);
					i++;
				}
				i = 0;
				coursesList.add(course);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		reader.close();
		
		return coursesList;
	}
	public static List<Grades> gradesReader() throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader("C:\\eNaplo\\CSV\\jegyek.csv"));
		String line = null;
		Scanner scanner = null;
		int i= 0;
		List<Grades> gradesList = new ArrayList<>();

		try {
			while ((line = reader.readLine()) != null) {
				Grades grade = new Grades();
				scanner = new Scanner(line);
				scanner.useDelimiter(",");
				while (scanner.hasNext()) {
					String data = scanner.next();
					if (i == 0)
						grade.setStudentsId(data);
					else if (i == 1)
						grade.setGrade(data);
					else if (i == 2)
						grade.setCourse(data);
					else if (i == 3)
						grade.setDate(data);
					else
						System.out.println("invalid data::" + data);
					i++;
				}
				i = 0;
				gradesList.add(grade);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		reader.close();
		
		return gradesList;
	}
}
