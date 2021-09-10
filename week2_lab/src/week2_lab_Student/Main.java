package week2_lab_Student;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String arg[]) {
		List<Student> al = new ArrayList<Student>();
		
		al.add(new Student(101,"Kim",25));
		al.add(new Student(102,"Park",22));
		al.add(new Student(103,"Choi",23));
		al.add(new Student(104,"Lee",27));
		al.add(new Student(105,"Adam",26));
		al.add(new Student(106,"Joseph",24));
		al.add(new Student(107,"Lisa",28));
		al.add(new Student(108,"Chan",29));
		al.add(new Student(109,"Rachel",21));
		al.add(new Student(110,"Cha",20));
		
		for(Student s : al) {
			System.out.println(s.toString());
		}
		
		System.out.println("Student List (reverse ordered by name)");
		Collections.sort(al);
		
		for(int i=0 ; i < al.size() ; i++) {
			System.out.println(al.get(i).toString());
		}
	}
}
