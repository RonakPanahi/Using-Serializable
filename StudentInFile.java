package student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentInFile {

	public static void main(String[] args) {
		
		
		StudentInfoWrite("Ronak Panahi", "88263109", 2017);
		StudentInfoRead();
		
	}

	public static void StudentInfoWrite(String Sname, String SID, int Year )
	{
		Student st = new Student ();
		st.setsName(Sname);
		st.setsID(SID);
		st.setYear(Year);
		
		
		try {
			FileOutputStream fos = new FileOutputStream("data.bin");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(st);
			oos.close();
			System.out.println("Writing Object to the file is done");
			System.out.println("Info is:\n"+ st.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	public static void StudentInfoRead()
	{
		   try {
			   FileInputStream fin = new FileInputStream("data.bin");
			   ObjectInputStream ois = new ObjectInputStream(fin);
			   Student s = (Student) ois.readObject();
			   System.out.println("\nObject Read! Info is: ");
			   System.out.println(s.toString());
			  
			   ois.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
