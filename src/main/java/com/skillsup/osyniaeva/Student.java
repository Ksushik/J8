package com.skillsup.osyniaeva;

/**
 * Created by osyniaeva on 10/10/17.
 */
public class Student {
	private int grade;
	private int age;
	private String name;

	public Student(int grade, int age, String name) {
		this.grade = grade;
		this.age = age;
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "\nStudent{" +
				"grade=" + grade +
				", age=" + age +
				", name='" + name + '\'' +
				"}";
	}
}
