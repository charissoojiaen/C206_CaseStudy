import java.util.ArrayList;
import java.util.Random;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("APPLE", 123, "P3", "CP53", "MARY"));
		studentList.add(new Student("Pear", 12, "P4", "CP52", "K"));
		studentList.add(new Student("Peach", 1, "P5", "CP51", "BYE"));
		
		ArrayList<CCA> ccaList = new ArrayList<CCA>();
		ccaList.add(new CCA("Volleyball", "Hitting the ball with wrist.", 20, "Tuesday",
				"3:00PM-4:30PM", "Volleyball court", "Jason", "Sports"));
		ccaList.add(new CCA("ArtClub", "Draw, express your thoughts freely!", 16, "Thursday",
				"3:00PM-4:00PM", "Art Room", "Jesmine", "Recreation"));
		ccaList.add(new CCA("NPCC", "Train your leadership skills and character.", 25,
				"Tuesday", "3:00PM-6:00PM", "Parade square", "Nazrul", "Uniform groups"));
		
		ArrayList<Category> categoryList = new ArrayList<Category>();
		categoryList.add(new Category("Sports", "CCAs with Physical Activity"));
		categoryList.add(new Category("Recreation", "CCAs involved with leisure hobbies"));
		categoryList.add(new Category("Uniform Groups", "CCAs targetting Discipline and Uniformity"));
		
		ArrayList<Admin> adminList = new ArrayList<Admin>();
		adminList.add(new Admin("Vincent", "T0987654E", "A3627"));
		adminList.add(new Admin("Gillian", "T2345671D", "A2930"));
		adminList.add(new Admin("Caroline", "T2435479E", "A1256"));
		
		ArrayList<Parent> parentList = new ArrayList<Parent>();
		
		Admin admin = new Admin("Fauzi", "T2310256D","A2344");
		

		//Gillian's code
		ParentRegister pr = new ParentRegister("123", "2345");

		ArrayList<RegisteredStudents> studentCCAList = new ArrayList<RegisteredStudents>();
        studentCCAList.add(new RegisteredStudents(123, "APPLE", "Volleyball"));
        studentCCAList.add(new RegisteredStudents(234, "Aiden", "NPCC"));

        C206_CaseStudy.ccaApplog();
        int choice = 0;

        choice = Helper.readInt("Enter option > ");
        if (choice == 1) {

        	C206_CaseStudy.loginRegiMenu();
        	String studentId = Helper.readString("Enter student ID > ");
        	String regiId = Helper.readString("Enter Registration ID > ");

        	boolean isParent = C206_CaseStudy.doParentLogin(pr, studentId, regiId);

        	if(!isParent) {
        		System.out.println("Either your username or password was incorrect!");

        	} else {
        		int option = 0;
        		while (option != 2) {
        			C206_CaseStudy.RegiMenu();
        			option = Helper.readInt("Enter an option > ");

        			if (option == 1) {
        				RegisteredStudents details = inputRegisterStudent();
        				addStudentCCA(studentCCAList, details);

        			} else if (option == 2) {
        				System.out.println("Thank you for using CCA registration App!");

        			} else {
        				System.out.println("Invalid option. Please try again");

        				// Gillian's code
        			}
        		}

        	}

        } else if (choice == 2) {
        	while (true) {

        		C206_CaseStudy.loginMenu();
        		String uName = Helper.readString("Enter username > ");
        		String uPassword = Helper.readString("Enter password > ");

        		boolean isAdmin = C206_CaseStudy.doAdminLogin(admin, uName, uPassword);

        		if (uName.equals(admin.getId()) && uPassword.equals(admin.getPassword())) {
        			if (isAdmin == false) {
        				System.out.println("Either your username or password was incorrect. Please try again!");
        			}

        			while (isAdmin) {
        				int option = 0;

        				while (option != 5) {

        					C206_CaseStudy.menu();
        					option = Helper.readInt("Enter an option > ");
        					
        				}

        				// Gillian's code
        			}
        		}
        	}

        } else if (choice == 2) {
		
    	while (true) {

			C206_CaseStudy.loginMenu();
			String uName = Helper.readString("Enter username > ");
			String uPassword = Helper.readString("Enter password > ");

			boolean isAdmin = C206_CaseStudy.doAdminLogin(admin, uName, uPassword);
			
		if (uName.equals(admin.getId()) && uPassword.equals(admin.getPassword())) {
			if (isAdmin == false) {
				System.out.println("Either your username or password was incorrect. Please try again!");
			}
			
		while (isAdmin) {
			
		int option = 0;	

		while (option != 5) {

		C206_CaseStudy.menu();
		option = Helper.readInt("Enter an option > ");

		if (option == 0) {

		} else if (option == 1) {
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

			CCA detail = inputCCADetails();
			C206_CaseStudy.addCCADetails(ccaList, detail);
			
		} else if (addType == 3) {
		// Add CCA Category

			Category cat = inputCategory();
			addCategory(categoryList, cat);

		} else if (addType == 4) {
		// Add Parent Account
		// Make parent class
		// inputParent method
		// addParent Method
			
			Parent p = inputParent(studentList);
			C206_CaseStudy.addParent(parentList, p);


		// Parent p = inputParent();
		// C206_CaseStudy.addParent(parentList, p);



		} else if (addType == 5) {
		// Add Student in CCA



		} else {
		System.out.println("Invalid type");
		}



		} else if(option == 2) {
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

			removeCCAdetails(ccaList);

		} else if (deleteType == 3) {
		// delete CCA Category

			removeCategory(categoryList);

		} else if (deleteType == 4) {
		// delete Parent Account
			
			deleteParentAccount(parentList);

		} else {
		System.out.println("Invalid type");
		}

		}else if(option == 3) {
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

			viewAllCCA(ccaList);
			
		} else if (viewType == 3) {
		// view CCA Category

			viewAllCategories(categoryList);

		} else if (viewType == 4) {
		// view Parent
			
			viewAllParent(parentList);

		} else {
		System.out.println("Invalid type");
		}


		}else if (option == 4) {
		// VIEW STUDENTS IN A CCA

		}else if(option == 5) {
		System.out.println("Goodbye!");
		} else {
		System.out.println("Invalid option!");
		}
		}
	
	}
	}
		}
	}
	}



		private static void menu() {
		// TODO Auto-generated method stub
		C206_CaseStudy.setHeader("CCA REGISTRATION APP");
		System.out.println("1. ADD");
		System.out.println("2. DELETE");
		System.out.println("3. VIEW");
		System.out.println("4. VIEW STUDENTS REGISTERED IN CCA");
		System.out.println("5. Quit");
		Helper.line(80, "=");
		}



		private static void setHeader(String header) {
		// TODO Auto-generated method stub
		Helper.line(80, "=");
		System.out.println(header);
		Helper.line(80, "=");
		}
		
		// Gillian's code
		public static void loginMenu() {
		Helper.line(80, "-");
		System.out.println("CCA REGISTRATION APP - LOGIN (ADMINISTRATOR)");
		Helper.line(80, "-");

		 }

		 public static void loginRegiMenu() {
		Helper.line(80, "-");
		System.out.println("CCA REGISTRATION APP - LOGIN (REGISTRATION)");
		Helper.line(80, "-");
		}

		 public static void ccaApplog() {
		Helper.line(32, "=");
		System.out.println("WELCOME TO CCA REGISTRATION APP");
		Helper.line(32, "=");
		System.out.println("1. Registration site ");
		System.out.println("2. Administrator login ");
		Helper.line(32, "=");

		 }

		 public static void RegiMenu() {
		C206_CaseStudy.setHeader("CCA REGISTRATION APP");
		System.out.println("1. REGISTER");
		System.out.println("2. QUIT");
		}
			
			
		//Gillian's code
		public static boolean doAdminLogin(Admin admin, String uName, String uPassword) {
			
			return admin.getId().equalsIgnoreCase(uName) && admin.getPassword().equals(uPassword);
		
}	
		public static boolean doParentLogin(ParentRegister pr, String studentId, String regiId) {

			 return pr.getStudentId().equals(studentId) && pr.getRegiId().equals(regiId);

			 }
		//Gillian's code

		//Vincent's code
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
	//Vincent's code
	
	//Charis's code
	//Add CCA details
			
		public static CCA inputCCADetails() {
			String title = Helper.readString("Enter title > ");
			String description = Helper.readString("Enter description > ");
			int size = Helper.readInt("Enter class size > ");
			String dayofWeek = Helper.readString("Enter day of week >");
			String time = Helper.readString("Enter time >");
			String venue = Helper.readString("Enter venue >");
			String inCharge = Helper.readString("Enter instructor-in-charge >");
			String category = Helper.readString("Enter category >");
						
			CCA detail= new CCA(title, description, size, dayofWeek, time, venue, inCharge, category);
			return detail;
						
		}
		
		public static void addCCADetails(ArrayList<CCA> ccaList, CCA detail) {
						
			ccaList.add(detail);
			System.out.println("CCA added!");
		}
				
		//View all CCAs
		public static String retrieveAllCCA(ArrayList<CCA> ccaList) {
			String output = "";

			for (int i = 0; i < ccaList.size(); i++) {

				output += String.format("%-15s %-60s %-20d %-15s %-15s %-20s %-30s %-25s\n", ccaList.get(i).getTitle(),
						ccaList.get(i).getDescription(), ccaList.get(i).getClassSize(),  ccaList.get(i).getDayOfWeek(),
						ccaList.get(i).getTime(),ccaList.get(i).getVenue(),ccaList.get(i).getInstrcInCharge(),
						ccaList.get(i).getCategory());
				}
					return output;
			}
		public static void viewAllCCA(ArrayList<CCA> ccaList) {
			C206_CaseStudy.setHeader("CCA LIST");
			String output = String.format("%-15s %-60s %-20s %-15s %-15s %-20s %-30s %-25s\n", "TITLE",
					"DESCRIPTION", "CLASS SIZE", "CCA DAY", "TIME", "VENUE", "INSTRUCTOR-IN-CHARGE", "CATEGORY");
			 output += retrieveAllCCA(ccaList);	
			System.out.println(output);
		}
					
		//Delete CCA details
		public static boolean removeCCAdetails(ArrayList<CCA> ccaList) {
			viewAllCCA(ccaList);
			boolean isDeleted = false;
			String delTitle = Helper.readString("Enter CCA to delete >");
						
			for(int i=0; i<ccaList.size(); i++) {
				CCA cca = ccaList.get(i);
				if(cca.getTitle().equalsIgnoreCase(delTitle)){
					isDeleted = true; 
					ccaList.remove(i);
					System.out.println(delTitle + " is deleted!");
					break;
				}
				else {
					isDeleted = false;
				}
							
			}
			return isDeleted;

			}
			//Charis code
		
		// fauzi's code
		
		public static void addParent(ArrayList<Parent> parentList, Parent p) {

			parentList.add(p);

		}

		public static Parent inputParent(ArrayList<Student> studentList) {

			int id = Helper.readInt("Enter student ID > ");

			Parent p = null;
			for (int i = 0; i < studentList.size(); i++) {

				if (id == studentList.get(i).getId()) {

					String name = Helper.readString("Enter name > ");
					int phoneNumber = Helper.readInt("Enter phone number > ");
					Random ran = new Random();
					int regID = ran.nextInt(1000);
					p = new Parent(name, phoneNumber, regID);
					System.out.println("Your registration id is "+ regID);
					System.out.println("Parent added");
					break;

				}

				else if (id != studentList.get(i).getId()) {
					System.out.println("Invalid student ID");
					break;
				}
			}

			return p;
		}

		  public static void viewAllParent(ArrayList<Parent> parentList) {
		    C206_CaseStudy.setHeader("Parent LIST");
		    String output = String.format("%-10s %-30s %-30s \n", "NAME", "PHONE NUMBER" , "REGISTRATION ID");
		    output += retrieveAllParent(parentList);
		    System.out.println(output);
		  }

		  public static String retrieveAllParent(ArrayList<Parent> parentList) {
		    String output = "";

		    for (int i = 0; i < parentList.size(); i++) {

		      output += String.format("%-10s %-30d %-30d \n", parentList.get(i).getName(),
		          parentList.get(i).getPhoneNumber(), parentList.get(i).getRegID());
		          
		          
		    }
		    return output;

		  }
		  
		  public static boolean deleteParentAccount(ArrayList<Parent> parentList ) {
		      viewAllParent(parentList);
		      boolean isDeleted = false;
		      
		      String delParent = Helper.readString("Enter name to delete >");
		      
		      for(int i=0; i < parentList.size(); i++) {
		      //String nameDeleted = parentList.get(i).getName();
		        if(delParent.equalsIgnoreCase(parentList.get(i).getName())){ 
		          isDeleted = true; 
		          parentList.remove(i);
		          System.out.println(delParent + " is deleted!");
		          break;
		        }
		        else {
		          isDeleted = false;
		        }
		        
		      }
		      return isDeleted;

		    }
		  
		  // fauzi's code

		  //caroline's code

		  private static Category inputCategory() {

			  String name = Helper.readString("Enter Category Name > ");
			  String desc = Helper.readString("Enter Category Description > ");

			  Category c = new Category(name, desc);
			  return c;

		  }

		  public static void addCategory(ArrayList<Category> categoryList, Category c) {

			  categoryList.add(c);
			  System.out.println("CCA Category added!");
		  }

		  public static void viewAllCategories(ArrayList<Category> categoryList) {
			  setHeader("CATEGORY LIST");
			  String output = String.format("%-10s %-30s\n", "NAME", "DESCRIPTION");
			  output += retrieveAllCategories(categoryList);
			  System.out.println(output);
		  }

		  public static String retrieveAllCategories(ArrayList<Category> categoryList) {

			  String output = "";

			  for (int i = 0; i < categoryList.size(); i++) {

				  String name = categoryList.get(i).getCategoryName();
				  String desc = categoryList.get(i).getCategoryDesc();
				  output += String.format("%-10s %-30s\n", name, desc);

			  }

			  return output;

		  }

		  public static boolean removeCategory(ArrayList<Category> categoryList ) {

			  viewAllCategories(categoryList);
			  boolean isDeleted = false;

			  String delCategory = Helper.readString("Enter category name to delete > ");

			  for (int i = 0; i < categoryList.size(); i++) {

				  String name = categoryList.get(i).getCategoryName();

				  if(delCategory.equalsIgnoreCase(name)) { 

					  isDeleted = true; 
					  categoryList.remove(i);
					  System.out.println(delCategory + " is deleted!");
					  break;
				  }
				  else {
					  isDeleted = false;
				  }

			  }
			  return isDeleted;

		  }

		  // caroline's code
		  
		  // Gillian's code

		  public static void addStudentCCA(ArrayList<RegisteredStudents> studentCCAList, RegisteredStudents detail) {

			  studentCCAList.add(detail);
			  System.out.println("Registered Students added!");
			  
		  }

		  public static String retrieveAllStudentCCA(ArrayList<RegisteredStudents> studentCCAList) {
			  String output = "";

			  for (RegisteredStudents rs : studentCCAList) {

				  output += String.format("%-5d %-10s %-10s\n", rs.getRegiStudentId(), rs.getRegiName(), rs.getRegiCCA());

			  }

			  return output;
		  }

		  public static void viewAllStudentCCA(ArrayList<RegisteredStudents> studentCCAList) {
			  C206_CaseStudy.setHeader("Registered studets LIST");
			  String output = String.format("%-5s %-10s %-10s \n", "ID", "NAME", "CCA");
			  output += retrieveAllStudentCCA(studentCCAList);
			  System.out.println(output);

		  }

		  public static RegisteredStudents inputRegisterStudent() {
			  int id = Helper.readInt("Enter ID > ");
			  String name = Helper.readString("Enter Student's Name > ");
			  String cca = Helper.readString("Enter Student's chosen CCA > ");

			  RegisteredStudents detail = new RegisteredStudents(id, name, cca);
			  return detail;


			  // Gillian's code
		  }
        }
		  
