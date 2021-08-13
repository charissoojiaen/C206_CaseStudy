
public class Student {

	private String name;
	private int id;
	private String grade;
	private String classes;
	private String teacher;

	public Student(String name, int id, String grade, String classes, String teacher) {
		this.name = name;
		this.id = id;
		this.grade = grade;
		this.classes = classes;
		this.teacher = teacher;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getGrade() {
		return grade;
	}

	public String getClasses() {
		return classes;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	

}
