
public class RegisteredStudents {
	
		private int studentId;
		private String name;
		private String cca;
		public RegisteredStudents(int studentId, String name, String cca) {
		this.studentId = studentId;
		this.name = name;
		this.cca = cca;
		}
		
		public int getRegiStudentId() {
		return studentId;
		}
		public String getRegiName() {
		return name;
		}
		public String getRegiCCA() {
		return cca;
		}

}
