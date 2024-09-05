package com.tnsif.dayEighteen.Demo;

public class Student {
	
	// Program to demonstrate Student Entity
	
	private int rollNo;
	private String name;
	private float per;
	
	public int getrollNo() {
		return rollNo;
	}
	public void setrollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	public float getper() {
		return per;
	}
	public void setper(float per) {
		this.per = per;
	}
	
	public Student(int rollNo, String name, float per) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.per = per;
	}
	
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [rollNo= "+ rollNo + ", Name" + name + ",Percentage= " + per + "]";
	}

}
