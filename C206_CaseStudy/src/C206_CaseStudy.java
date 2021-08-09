import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("APPLE", 123, "P3", "CP53", "MARY"));
		studentList.add(new Student("Pear", 12, "P4", "CP52", "K"));
		studentList.add(new Student("Peach", 1, "P5", "CP51", "BYE"));


		int option = 0;



		while (option != 6) {



		C206_CaseStudy.menu();
		option = Helper.readInt("Enter an option > ");



		if (option == 1) {



		} else if (option == 2) {
		// Add a new item
		C206_CaseStudy.setHeader("ADD ");
		System.out.println("1. Add Student");
		System.out.println("2. Add CCA Details");
		System.out.println("3. Add CCA Category ");
		System.out.println("4. Add Parent Account ");
		System.out.println("5. Add Student For CCA");



		int addType = Helper.readInt("Enter option to add ______ > ");



		if (addType == 1) {
		// Add Student
		// Camcorder cc = inputCamcorder();
		// ResourceCentre.addCamcorder(camcorderList, cc);
			Student st = inputStudent();
			addStudents(studentList, st);


		// Student ___ = __________();
		// C206_CaseStudy.addStudent(studentList , ___ )



		} else if (addType == 2) {
		// Add CCA Details



		// Chromebook cb = inputChromebook();
		// ResourceCentre.addChromebook(chromebookList, cb);
		} else if (addType == 3) {
		// Add CCA Category



		} else if (addType == 4) {
		// Add Parent Account
		// Make parent class
		// inputParent method
		// addParent Method



		// Parent p = inputParent();
		// C206_CaseStudy.addParent(parentList, p);



		} else if (addType == 5) {
		// Add Student in CCA



		} else {
		System.out.println("Invalid type");
		}



		} else if(option == 3) {
		// DELETE
		C206_CaseStudy.setHeader("DELETE ");
		System.out.println("1. Delete Student");
		System.out.println("2. Delete CCA");
		System.out.println("3. Delete CCA Category ");
		System.out.println("4. Delete Parent");

		int deleteType = Helper.readInt("Enter option to delete ______ > ");

		if (deleteType == 1) {
		// delete Student
			removeAStudent(studentList);
			
		} else if (deleteType == 2) {
		// delete CCA Details



		} else if (deleteType == 3) {
		// delete CCA Category



		} else if (deleteType == 4) {
		// delete Parent Account

		} else {
		System.out.println("Invalid type");
		}

		}else if(option == 4) {
		//VIEW
		C206_CaseStudy.setHeader("VIEW ");
		System.out.println("1. View Student");
		System.out.println("2. View CCA");
		System.out.println("3. View CCA Category ");
		System.out.println("4. View Parent");

		int viewType = Helper.readInt("Enter option to view ______ > ");

		if (viewType == 1) {
		// view Student
			
			viewAllStudent(studentList);
	
		} else if (viewType == 2) {
		// view CCA



		} else if (viewType == 3) {
		// view CCA Category



		} else if (viewType == 4) {
		// view Parent

		} else {
		System.out.println("Invalid type");
		}


		}else if (option == 5) {
		// VIEW STUDENTS IN A CCA

		}else if(option == 6) {
		System.out.println("Goodbye!");
		} else {
		System.out.println("Invalid option!");
		}
		}
		}



		private static void menu() {
		// TODO Auto-generated method stub
		C206_CaseStudy.setHeader("RESOURCE CENTRE APP");
		System.out.println("1. LOGIN");
		System.out.println("2. ADD");
		System.out.println("3. DELETE");
		System.out.println("4. VIEW");
		System.out.println("5. VIEW STUDENTS REGISTERED IN CCA");
		System.out.println("6. Quit");
		Helper.line(80, "-");
		}



		private static void setHeader(String header) {
		// TODO Auto-generated method stub
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
		}

	


	private static Student inputStudent() {

		String name = Helper.readString("Enter name > ");
		int id = Helper.readInt("Enter Student ID > ");
		String grade = Helper.readString("Enter grade > ");
		String classes = Helper.readString("Enter class > ");
		String teacher = Helper.readString("Enter teacher > ");

		Student st = new Student(name, id, grade, classes, teacher);
		return st;
	}

	public static void addStudents(ArrayList<Student> studentList, Student st) {

		studentList.add(st);
		System.out.println("Student added");
	}

	public static String retriveStudent(ArrayList<Student> studentList) {
		String output = "";
		int i = 0;

		for (Student st : studentList) {

			output += String.format("%-10d %-10d %-30s %-10s %-10s %-20s\n", (i + 1), st.getId(), st.getName(),
					st.getGrade(), st.getClasses(), st.getTeacher());
			i++;
		}

		return output;
	}

	public static void viewAllStudent(ArrayList<Student> studentList) {
		Helper.line(50, "-");
		System.out.println("Student List");
		Helper.line(50, "-");
		String output = String.format("%-10s %-10s %-30s %-10s %-10s %-20s\n", "NO.", "ID", "NAME", "GRADE", "CLASS",
				"TEACHER");
		output += retriveStudent(studentList);
		System.out.println(output);
	}

	public static void removeAStudent(ArrayList<Student> studentList) {
		viewAllStudent(studentList);
		int number = Helper.readInt("Enter student id to remove > ");
		int index = number - 1;

		if (index < studentList.size()) {
			studentList.remove(index);
			System.out.println("Student Deleted!");

		} else {
			System.out.println("Delete fail!");
		}

	}

}
