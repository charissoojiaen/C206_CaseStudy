
public class C206_CaseStudy {

	public static void main(String[] args) {
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

}
