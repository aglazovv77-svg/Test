package glazov;

public class Student {

	String name;
	int age;
	String course;
	int number;

	public Student(String name, int age, String course, int number) {
		this.name = name;
		this.age = age;
		this.course = course;
		this.number = number;
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return String.format("Имя : %s, возраст :  %d, название курса : %s, курс : %d, ", name, age, course, number);
	}
}