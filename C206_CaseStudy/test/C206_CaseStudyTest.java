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
	}

	@Test
	public void c206_test() {
		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);
	}

}
