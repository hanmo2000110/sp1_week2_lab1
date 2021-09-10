package week2_lab_Student;

public class Student implements Comparable<Student> {
	int no;
	String name;
	int age;
	
	public Student(int no_, String name_, int age_) {
		no = no_;
		name = name_;
		age = age_;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Student [no=" + no + ", name=" + name + ", age=" + age + "]");
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
}
