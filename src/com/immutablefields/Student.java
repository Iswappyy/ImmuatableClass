package com.immutablefields;

public final class Student {
	private final int roll_num;
	private final String name;
	private final String college;

	Student(int roll_num, String name, String college) {
		super();
		this.roll_num = roll_num;
		this.name = name;
		this.college = college;
	}

	public int getRoll_num() {
		return roll_num;
	}

	public String getName() {
		return name;
	}

	public String getCollege() {
		return college;
	}

}

class Test {
	public static void main(String[] args) {
		Student s1 = new Student(48, "Swpanil", "VJTI");
		System.out.println("The roll num of student is: " + s1.getRoll_num());
		System.out.println("The name of student is: " + s1.getName());
		System.out.println("The college name is: " + s1.getCollege());
	}
}
