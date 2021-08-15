import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {

	private Student stu1;
	private Student stu2;
	private Student stu3;
	private CCA cca1;
	private CCA cca2;
	private CCA cca3;
	private Category cat1;
	private Category cat2;
	private Category cat3;
	private Admin ad1;
	private Admin ad2;
	private Admin ad3;
	private Admin ad4;
	private Parent p1;
	private Parent p2;
	private Parent p3;

	ArrayList<Student> studentList;
	ArrayList<CCA> ccaList;
	ArrayList<Category> categoryList;
	ArrayList<Admin> adminList;
	ArrayList<Parent> parentList;
	
	public C206_CaseStudyTest(){
		super();
	}

	@Before
	public void setUp() throws Exception {
		cca1 = new CCA("Volleyball", "Hitting the ball with wrist.", 20, "Tuesday", "3:00PM-4:30PM", "Volleyball court",
				"Jason", "Sports");
		cca2 = new CCA("ArtClub", "Draw, express your thoughts freely!", 16, "Thursday", "3:00PM-4:00PM", "Art Room",
				"Jesmine", "Recreation");
		cca3 = new CCA("NPCC", "Train your leadership skills and character.", 25, "Tuesday", "3:00PM-6:00PM",
				"Parade square", "Nazrul", "Uniform groups");

		stu1 = new Student("APPLE", 123, "P3", "CP53", "MARY");
		stu2 = new Student("Pear", 12, "P4", "CP52", "K");
		stu3 = new Student("Peach", 1, "P5", "CP51", "BYE");
		
		cat1 = new Category("Sports", "CCAs with Physical Activity");
		cat2 = new Category("Recreation", "CCAs involved with leisure hobbies");
		cat3 = new Category("Uniform Groups", "CCAs targetting Discipline and Uniformity");
		
		ad1 = new Admin("Vincent", "T0987654E", "A3627");
		ad2 = new Admin("Gillian", "T2345671D", "A2930");
		ad3 = new Admin("Caroline", "T2435479E", "A1256");
		ad4 = new Admin("Fauzi", "T2310256D","A2344");
		
		studentList = new ArrayList<Student>();
		ccaList = new ArrayList<CCA>();
		categoryList = new ArrayList<Category>();
		adminList = new ArrayList<Admin>();
		parentList = new ArrayList<Parent>();
	}
	@Test
	public void addStudents() {
		assertNotNull("Check if there is valid Student arraylist to add to", studentList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		C206_CaseStudy.addStudents(studentList, stu1);
		assertEquals("Check that studentList arraylist size is 1", 1, studentList.size());
		assertSame("Check that studentList is added", stu1, studentList.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addStudents(studentList, stu2);
		assertEquals("Check that studentList arraylist size is 2", 2, studentList.size());
		assertSame("Check that studentList is added", stu2, studentList.get(1));
		
		C206_CaseStudy.addStudents(studentList, stu3);
		assertEquals("Check that studentList arraylist size is 3", 3, studentList.size());
		assertSame("Check that studentList is added", stu3, studentList.get(2));
	}
	@Test
	public void retrieveStudents() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Student arraylist to retrieve item", studentList);
		
		//test if the list of student retrieved from the case study is empty - boundary
		String allStudent= C206_CaseStudy.retriveStudent(studentList);
		String testOutput = "";
		assertEquals("Test that viewAllStudent is empty", testOutput, allStudent);
		
		//Given an empty list, after adding 3 students, test if the size of the list is 3 - normal
		C206_CaseStudy.addStudents(studentList, stu1);
		C206_CaseStudy.addStudents(studentList, stu2);
		C206_CaseStudy.addStudents(studentList, stu3);
		assertEquals("Test that Camcorder arraylist size is 3", 3, studentList.size());
		
		//test if the expected output string same as the list of studentList retrieved from the CaseStudy	
		allStudent= C206_CaseStudy.retriveStudent(studentList);
		testOutput = String.format("%-10d %-10d %-30s %-10s %-10s %-20s\n",1, 123,"APPLE",
				"P3", "CP53" , "MARY");
		testOutput += String.format("%-10d %-10d %-30s %-10s %-10s %-20s\n",2, 12,"Pear",
				"P4", "CP52" , "K");
		testOutput += String.format("%-10d %-10d %-30s %-10s %-10s %-20s\n",3, 1,"Peach",
				"P5", "CP51" , "BYE");
	
		assertEquals("Test that ViewAllStudentlist", testOutput, allStudent);

	}
	@Test
	public void removeAStudent() {
		assertNotNull("Test if there is valid Student arraylist to retrieve item", studentList);
	
		//Given an empty list, after adding 3 items, test if the size of the list is 3 - normal
		C206_CaseStudy.addStudents(studentList, stu1);
		C206_CaseStudy.addStudents(studentList, stu2);
		C206_CaseStudy.addStudents(studentList, stu3);
		assertEquals("Test that Camcorder arraylist size is 3", 3, studentList.size());
		
		
		studentList.remove(stu1);
		assertEquals("Check that studentList arraylist size is 2", 2, studentList.size());
		
		studentList.remove(stu2);
		assertEquals("Check that studentList arraylist size is 1", 1, studentList.size());
		
		studentList.remove(stu3);
		assertEquals("Check that studentList arraylist size is 0", 0, studentList.size());
	}
	@Test
	
	public void updateStudents() {
			assertNotNull("Test if there is valid Student arraylist to retrieve item", studentList);
		
			C206_CaseStudy.addStudents(studentList, stu1);
			C206_CaseStudy.addStudents(studentList, stu2);
			C206_CaseStudy.addStudents(studentList, stu3);
			assertEquals("Test that Camcorder arraylist size is 3", 3, studentList.size());
			
			stu1.setClasses("FB12");
			stu1.setGrade("P6");
			stu1.setTeacher("K");
			assertNotEquals("Check if after setting new values, the content is not same", stu1);
			
			stu2.setClasses("PB12");
			stu2.setGrade("P5");
			stu2.setTeacher("Ka");
			assertNotEquals("Check if after setting new values, the content is not same", stu2);
		
			stu3.setClasses("FC12");
			stu3.setGrade("P1");
			stu3.setTeacher("LO");
			assertNotEquals("Check if after setting new values, the content is not same", stu3);
			
			
		
		}


	
	@Test
	public void addCCADetails() {
		assertNotNull("Check if there is valid CCA arraylist to add to", ccaList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		C206_CaseStudy.addCCADetails(ccaList, cca1);
		assertEquals("Check that ccaList arraylist size is 1", 1, ccaList.size());
		assertSame("Check that ccaList is added", cca1, ccaList.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addCCADetails(ccaList, cca2);
		assertEquals("Check that ccaList arraylist size is 2", 2, ccaList.size());
		assertSame("Check that ccaList is added", cca2, ccaList.get(1));
		
		C206_CaseStudy.addCCADetails(ccaList, cca3);
		assertEquals("Check that ccaList arraylist size is 3", 3, ccaList.size());
		assertSame("Check that ccaList is added", cca3, ccaList.get(2));
	}
	@Test
	public void retrieveAllCCA() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid CCA arraylist to retrieve item", ccaList);
		
		//test if the list of student retrieved from the case study is empty - boundary
		String allCCA= C206_CaseStudy.retrieveAllCCA(ccaList);
		String testOutput = "";
		assertEquals("Test that viewAllCCA is empty", testOutput, allCCA);
		
		//Given an empty list, after adding 3 items, test if the size of the list is 3 - normal
		C206_CaseStudy.addCCADetails(ccaList, cca1);
		C206_CaseStudy.addCCADetails(ccaList, cca2);
		C206_CaseStudy.addCCADetails(ccaList, cca3);
		assertEquals("Test that CCA arraylist size is 3", 3, ccaList.size());
		
		//test if the expected output string same as the list of CCAs retrieved from the CaseStudy	
		allCCA= C206_CaseStudy.retrieveAllCCA(ccaList);
		testOutput = String.format("%-15s %-60s %-20d %-15s %-15s %-20s %-30s %-25s\n", "Volleyball","Hitting the ball with wrist.",
				20, "Tuesday", "3:00PM-4:30PM" , "Volleyball court", "Jason", "Sports");
		testOutput += String.format("%-15s %-60s %-20d %-15s %-15s %-20s %-30s %-25s\n", "ArtClub","Draw, express your thoughts freely!",
				16, "Thursday", "3:00PM-4:00PM" , "Art Room", "Jesmine", "Recreation");
		testOutput += String.format("%-15s %-60s %-20d %-15s %-15s %-20s %-30s %-25s\n", "NPCC","Train your leadership skills and character.",
				25, "Tuesday", "3:00PM-6:00PM" , "Parade square", "Nazrul", "Uniform groups");
	
		assertEquals("Test that ViewAllCCAlist", testOutput, allCCA);

	}
	@Test
	public void removeCCAdetails() {
		assertNotNull("Test if there is valid CCA arraylist to retrieve item", studentList);
		
		//test if the list of student retrieved from the case study is empty - boundary
		
		//Given an empty list, after adding 3 items, test if the size of the list is 3 - normal
		C206_CaseStudy.addCCADetails(ccaList, cca1);
		C206_CaseStudy.addCCADetails(ccaList, cca2);
		C206_CaseStudy.addCCADetails(ccaList, cca3);
		assertEquals("Test that CCA arraylist size is 3", 3, ccaList.size());
		
		
		ccaList.remove(cca1);
		assertEquals("Check that ccaList arraylist size is 2", 2, ccaList.size());
		
		ccaList.remove(cca2);
		assertEquals("Check that ccaList arraylist size is 1", 1, ccaList.size());
		
		ccaList.remove(cca3);
		assertEquals("Check that ccaList arraylist size is 0", 0, ccaList.size());
	}
	
		@Test
	public void addCategory() {
		
		assertNotNull("Check if there is valid Category arraylist to add to", categoryList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		C206_CaseStudy.addCategory(categoryList, cat1);
		assertEquals("Check that categoryList arraylist size is 1", 1, categoryList.size());
		assertSame("Check that category is added", cat1, categoryList.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addCategory(categoryList, cat2);
		assertEquals("Check that categoryList arraylist size is 2", 2, categoryList.size());
		assertSame("Check that category is added", cat2, categoryList.get(1));
		
		C206_CaseStudy.addCategory(categoryList, cat3);
		assertEquals("Check that categoryList arraylist size is 3", 3, categoryList.size());
		assertSame("Check that category is added", cat3, categoryList.get(2));
		
	}
	
	@Test
	public void retrieveAllCategories() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Category arraylist to retrieve categories", categoryList);
		
		//test if the list of student retrieved from the case study is empty - boundary
		String allCat= C206_CaseStudy.retrieveAllCategories(categoryList);
		String testOutput = "";
		assertEquals("Test that viewAllCategories is empty", testOutput, allCat);
		
		//Given an empty list, after adding 3 items, test if the size of the list is 3 - normal
		C206_CaseStudy.addCategory(categoryList, cat1);
		C206_CaseStudy.addCategory(categoryList, cat2);
		C206_CaseStudy.addCategory(categoryList, cat3);
		assertEquals("Test that Category arraylist size is 3", 3, categoryList.size());
		
		//test if the expected output string same as the list of CCAs retrieved from the CaseStudy	
		allCat = C206_CaseStudy.retrieveAllCategories(categoryList);
		testOutput = String.format("%-20s %-30s\n", "Sports", "CCAs with Physical Activity");
		testOutput += String.format("%-20s %-30s\n", "Recreation", "CCAs involved with leisure hobbies");
		testOutput += String.format("%-20s %-30s\n", "Uniform Groups", "CCAs targetting Discipline and Uniformity");
	
		assertEquals("Test that ViewAllCategory is same", testOutput, allCat);

	}
	
	@Test
	public void removeCategory() {
		assertNotNull("Test if there is valid Category arraylist to retrieve item", categoryList);
		
		//test if the list of category retrieved from the case study is empty - boundary
		
		//Given an empty list, after adding 3 items, test if the size of the list is 3 - normal
		C206_CaseStudy.addCategory(categoryList, cat1);
		C206_CaseStudy.addCategory(categoryList, cat2);
		C206_CaseStudy.addCategory(categoryList, cat3);
		assertEquals("Test that categoryList arraylist size is 3", 3, categoryList.size());
		
		categoryList.remove(cat1);
		assertEquals("Check that categoryList arraylist size is 2", 2, categoryList.size());
		
		categoryList.remove(cat2);
		assertEquals("Check that categoryList arraylist size is 1", 1, categoryList.size());
		
		categoryList.remove(cat3);
		assertEquals("Check that categoryList arraylist size is 0", 0, categoryList.size());
	}
	
	@Test
	public void updateCategory() {
		assertNotNull("Test if there is valid Category arraylist to retrieve item", categoryList);
	
		C206_CaseStudy.addCategory(categoryList, cat1);
		C206_CaseStudy.addCategory(categoryList, cat2);
		C206_CaseStudy.addCategory(categoryList, cat3);
		assertEquals("Test that Category arraylist size is 3", 3, categoryList.size());
		
		cat1.setCategoryName("Holy Moly");
		cat1.setCategoryDesc("Oh Cow");
		assertNotEquals("Check if after setting new values, the content is not same", cat1);
		
		cat2.setCategoryName("Outdoor Adventure");
		cat2.setCategoryDesc("Sporty sports sports");
		assertNotEquals("Check if after setting new values, the content is not same", cat2);
	
		cat3.setCategoryName("Music to my ears");
		cat3.setCategoryDesc("Beautiful Instruments");
		assertNotEquals("Check if after setting new values, the content is not same", cat3);
		
		
	
	}
	
	
	
	
	@After
	public void tearDown() throws Exception {
		cca1 = null;				
		cca2 =null;				
		cca3 = null;
		stu1 = null;
		stu2 = null;
		stu3 = null;		
		cat1 = null;
		cat2 = null;
		cat3 = null;		
		ad1 = null;
		ad2 = null;
		ad3 = null;
		ad4 = null;		
		p1 = null;
		p2 = null;
		p3 = null;
		
		studentList = null;
		ccaList = null;
		categoryList = null;
		adminList = null;
		parentList = null;
	}

	@Test
	public void c206_test() {
		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);
	
	}

}
