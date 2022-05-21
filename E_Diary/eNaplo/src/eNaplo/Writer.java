package eNaplo;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Writer {
	public static void gradeIn(int grade, Student student, Courses course)
	{
		try {
			FileWriter fw = new FileWriter("C:\\eNaplo\\CSV\\jegyek.csv", true);
	        BufferedWriter bw = new BufferedWriter(fw);
	        PrintWriter pw = new PrintWriter(bw);
	        
	        Date date = new Date();
	        SimpleDateFormat DateFor = new SimpleDateFormat("yyyy-MM-dd");
	        String stringDate = DateFor.format(date);

	        
	        pw.println(student.getId() +"," + grade +"," + course.getName() + "," + stringDate);
	        pw.flush();
	        pw.close();
	        System.out.println("Grade created: Grade: " +grade+ ", Student: Name: " + student.getName() + " Date: " + stringDate );
	        
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
