package com.nt.beans;

public class Student {

	private int sno;
	private String sname;
	private String sadd;
	private double avg;
	private String course;
	
	
	/*	public Student(int sno, String sname, String sadd, double avg, String course) {
			System.out.println("Student 4 param constructor");
			this.sno = sno;
			this.sname = sname;
			this.sadd = sadd;
			this.avg = avg;
			this.course = course;
		}
	*/
public Student(int sno, String sname, String sadd) {
		System.out.println("3 param constructor");
		this.sno = sno;
		this.sname = sname;
		this.sadd = sadd;
	}
	
	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", sadd=" + sadd + ", avg=" + avg + ", course=" + course
				+ "]";
	}


	


	
	
	
	
	
}
