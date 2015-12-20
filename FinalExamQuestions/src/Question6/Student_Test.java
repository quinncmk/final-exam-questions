package Question6;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate1 = null;
		Date dBirthDate2 = null;
		Date dBirthDate3 = null;
		Date dBirthDate4 = null;
		Date dBirthDate5 = null;
		try {
			dBirthDate1 = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
			dBirthDate2 = new SimpleDateFormat("yyyy-MM-dd").parse("1994-11-27");
			dBirthDate3 = new SimpleDateFormat("yyyy-MM-dd").parse("1995-06-20");
			dBirthDate4 = new SimpleDateFormat("yyyy-MM-dd").parse("1993-09-11");
			dBirthDate5 = new SimpleDateFormat("yyyy-MM-dd").parse("1994-06-20");
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate1, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("Mingkun", "a", "Chen", dBirthDate2, "702 stone gate blvd", "302-521-8799", "quinncmk@udel.edu","MIS");
		Student stu3 = new Student("Yufei", "b", "Liu", dBirthDate3, "300 west 20th", "302-123-7465", "yufei@udel.edu","MIS");
		Student stu4 = new Student("Longzhao", "c", "Hong", dBirthDate4, "2202 stone gate", "302-562-8932", "longzhao@udel.edu","MIS");
		Student stu5 = new Student("Bo", "d", "Pei", dBirthDate5, "5002 winter blvd", "302-666-7864", "bobo@udel.edu","MIS");
		
		Map<UUID, Student> hm = new HashMap<UUID, Student>();
		hm.put(stu1.getPersonID(), stu1);
		hm.put(stu2.getPersonID(), stu2);
		hm.put(stu3.getPersonID(), stu3);
		hm.put(stu4.getPersonID(), stu4);
		hm.put(stu5.getPersonID(), stu5);
		
		assertTrue(hm.size() == 5);
		
	}

}
