package eNaplo;

import java.util.*;

public class App {

	public static void main(String[] args) throws Exception {
		List<Student> studentsList = Reader.studentsReader();
		List<Courses> coursesList = Reader.coursesReader();
		List<Grades> gradesList = Reader.gradesReader();
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("For teachers login press (0), for students login press (1): ");
			int loginPanel = input.nextInt();
			input.nextLine();
			if(loginPanel == 0)
			{
				System.out.print("Login name: ");
				String inLogin = input.nextLine();
				List<Courses> teachersCourses = new ArrayList<>();
				List<Student> courseStudents = new ArrayList<>();
				
				Teacher loggedInTeacher = Login.teacherLogin(inLogin);
				
				System.out.print("Enter the password: ");
				String inPassword = input.nextLine();
				
				if(loggedInTeacher.getPassword().equals(inPassword))
				{
					System.out.println("Welcome " + loggedInTeacher.getName());
					System.out.print("Your courses: \n");
					
					for(int i = 0; i < coursesList.size(); i++)
					{
						if(coursesList.get(i).getTeachersId().equals(loggedInTeacher.getId()))
						{
							teachersCourses.add(coursesList.get(i));
						}
					}
					
					for(int i = 0;i<teachersCourses.size();i++)
					{
						System.out.print(i+1 + ". Name: " + teachersCourses.get(i).getName() + ", School Class: " + teachersCourses.get(i).getSchoolClass()+ "\n");
					}
					
					System.out.print("Choose the number of the course (between: 1 - " + teachersCourses.size() + "): ");
					
					int choosenCourse = input.nextInt();
					
					if(choosenCourse <= teachersCourses.size())
					{	
						for(int i = 0; i < studentsList.size(); i++)
						{
							if(studentsList.get(i).getStClass().equals(teachersCourses.get(choosenCourse-1).getSchoolClass()))
							{
								courseStudents.add(studentsList.get(i));
							}
						}
						
						for(int i=0;i<courseStudents.size();i++)
						{
							System.out.print(i+1 + ". Name: " +courseStudents.get(i).getName()+"\n");
						}
						System.out.print("Choose the number of student (between: 1 - " + courseStudents.size() + "): ");
						int choosenStudent = input.nextInt();
						System.out.print("Enter the grade value: ");
						int enteredGrade = input.nextInt();

						Writer.gradeIn(enteredGrade, courseStudents.get(choosenStudent-1), teachersCourses.get(choosenCourse-1) );
					}
					else {
						throw new Exception("Wrong number.");
					}
				}
				else {
					System.out.println("Login name and/or password not valid.");
				}
			}
			else if(loginPanel == 1)
			{
				System.out.print("Login name: ");
				String inLogin = input.nextLine();
				
				Student loggedInStudent = Login.studentLogin(inLogin);
				
				
				System.out.print("Enter the password: ");
				String inPassword = input.nextLine();
				
				if(loggedInStudent.getPassword().equals(inPassword))
				{
					System.out.println("Welcome student: " + loggedInStudent.getName() + ", your class is: " + loggedInStudent.getStClass());
					String c = "";
					do {
						System.out.println("Your courses: ");
						List<Courses> loggedInStudentCourses = new ArrayList<>();
											
						for(int i = 0; i < coursesList.size();i++)
						{
							if(coursesList.get(i).getSchoolClass().equals(loggedInStudent.getStClass()))
							{
								loggedInStudentCourses.add(coursesList.get(i));
							}
						}
						
						for(int i=0;i<loggedInStudentCourses.size();i++)
						{
							System.out.println(i+1 +". " +loggedInStudentCourses.get(i).getName().toUpperCase());
						}
						
						int choosenCourse;
						
						System.out.print("Choose the number of the course (between: 1-"+ loggedInStudentCourses.size() +"): ");
						try {
							choosenCourse = input.nextInt();
							
							while(choosenCourse > loggedInStudentCourses.size() || choosenCourse <= 0)
							{
								System.out.println("Input is not in range!");
								System.out.print("Choose the number of the course (between: 1-"+ loggedInStudentCourses.size() +"): ");
								choosenCourse = input.nextInt();
							}							
							if(choosenCourse <= loggedInStudentCourses.size() && choosenCourse > 0)
							{
								System.out.print("Grades: ");
								for(int i =0;i<gradesList.size();i++)
								{
									if(gradesList.get(i).getStudentsId().equals(loggedInStudent.getId()) && gradesList.get(i).getCourse().equals(loggedInStudentCourses.get(choosenCourse-1).getName()))
									{
										System.out.print(gradesList.get(i).getGrade()+", ");
									}
								}
							}

						}catch (InputMismatchException ex) {
							System.out.println("Input should be Integer!");
					    }
						
						input.nextLine();
						
						System.out.print("\nAre you finished? (type y/n): ");
						c = input.nextLine();
						
					}while(c.equalsIgnoreCase("n"));
					
				}
				else {
					throw new Exception("Login name and/or password not valid.");
				}
			}
			else {
				throw new Exception("Wrong number.");
			}
		}
	}
}
