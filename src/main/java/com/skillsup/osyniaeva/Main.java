package com.skillsup.osyniaeva;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by osyniaeva on 10/10/17.
 */
public class Main {
	public static void main(String[] args) {
		Student bob = new Student(100, 18, "Bob Marley");
		Student nina = new Student(88, 22, "Nana Ricchy");
		Student rojer = new Student(71, 19, "Rojer Peterson");
		Student kira = new Student(98, 21, "Kira Fisher");
		Student stan = new Student(99, 34, "Stanley Black");
		Student pet = new Student(69, 24, "Peter Pen");

		List<Student> students = new ArrayList<>();
		students.add(bob);
		students.add(nina);
		students.add(rojer);
		students.add(kira);
		students.add(stan);
		students.add(pet);

		System.out.println("\n до сортировки");

		System.out.println(students);

		// old way with anonimus class

		//		Collections.sort(students, new Comparator<Student> () {
		//
		//			@Override
		//			public int compare(Student o1, Student o2) {
		//				return o1.getGrade() - o2.getGrade();
		//			}
		//		});

		// new way with lambda expression
		Collections.sort(students, (st1, st2) -> st1.getGrade() - st2.getGrade());

		System.out.println("\n после сортировки");
		System.out.println(students);

		System.out.println("\n ********************************************");
		System.out.println(bob.getName() + " is Adult: " + isAdult(bob, (Student student) -> student.getAge() > 17));

		System.out.println(stan.getName() + " is Adult: " + isAdult(stan, (Student student) -> student.getAge() > 21));

		// streams sample

		List<String> studentsNames = students.stream().map(student -> student.getName()).collect(Collectors.toList());

		studentsNames.stream().forEach(System.out::println);

		List<Student> adultStudents = students.stream().filter(Main::isAdultInUa).collect(Collectors.toList());

		System.out.println(adultStudents);

	}
	private static boolean isAdultInUa(Student student) {
		return isAdult(student, (Student st) -> st.getAge() > 18);
	}


	// sample of usage functional interface Predicate from java.util.function
	private static boolean isAdult(Student student, Predicate<Student> condition) {
		if (condition.test(student)) {
			return true;
		}
		return false;
	}

}
