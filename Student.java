package student;

import java.io.Serializable;

public class Student implements Serializable{

	   String sName;
	   String sID;
	   int year;

	
	   public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public String getsID() {
		return sID;
	}


	public void setsID(String sID) {
		this.sID = sID;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	@Override
	   public String toString() {
 	   return new StringBuffer(" Student Name : ").append(this.sName)
 	   .append(",, Student ID : ").append(this.sID)
 	   .append(",, Entrance Year: ") .append(this.year)
 	   .toString();
 	   
	   }
}
