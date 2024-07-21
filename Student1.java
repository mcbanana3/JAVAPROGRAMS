package JAVACTOOOD;

import java.util.Scanner;

public class Student1 {
	
	private String name;
	private int id;
	
	public Student1(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getID() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Details : {NAME : "+name+", ID : "+id+"}";
	}
}