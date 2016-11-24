package testuitvoer;
import static org.junit.Assert.*;
import org.junit.Test;
import codebase.Beoordeling_Login;


public class Beoordeling_login_Test {

	@Test
	public void TC01() {
		
		Beoordeling_Login TC01 = new Beoordeling_Login();
		assertTrue (TC01.correctinloggen("PRO", "testleader", "Chrome"));
	}
	@Test
	public void TC02() {
		
		Beoordeling_Login TC02 = new Beoordeling_Login();
		assertTrue (TC02.correctinloggen("PRO", "developer", "Chrome"));
	}
	@Test
	public void TC03() {
		
		Beoordeling_Login TC03 = new Beoordeling_Login();
		assertTrue (TC03.correctinloggen("PRO", "testanalyst", "Chrome"));
	}
	
	@Test
	public void TC04() {
		
		Beoordeling_Login TC04 = new Beoordeling_Login();
		assertTrue (TC04.correctinloggen("PRO", "stakeholder", "Chrome"));
	}
	
	@Test
	public void TC05() {
		
		Beoordeling_Login TC05 = new Beoordeling_Login();
		assertTrue (TC05.correctinloggen("PRO", "projectmanager", "Chrome"));
	}
	
	@Test
	public void TC06() {
		
		Beoordeling_Login TC06 = new Beoordeling_Login();
		assertTrue (TC06.correctinloggen("PRO", "testleader", "Firefox"));
	}
	
	@Test
	public void TC07() {
		
		Beoordeling_Login TC07 = new Beoordeling_Login();
		assertTrue (TC07.correctinloggen("PRO", "developer", "Firefox"));
	}
	@Test
	public void TC08() {
		
		Beoordeling_Login TC08 = new Beoordeling_Login();
		assertTrue (TC08.correctinloggen("PRO", "testanalyst", "Firefox"));
	}
	
	@Test
	public void TC09() {
		
		Beoordeling_Login TC09 = new Beoordeling_Login();
		assertTrue (TC09.correctinloggen("PRO", "stakeholder", "Firefox"));
	}
	@Test
	public void TC10() {
		
		Beoordeling_Login TC10 = new Beoordeling_Login();
		assertTrue (TC10.correctinloggen("PRO", "projectmanager", "Firefox"));
	}
	 
	/* @Test
	public void TC11() {
		
		Beoordeling_Testcases TC11 = new Beoordeling_Testcases();
		assertEquals ( "true", TC11.correctinloggen("ACC", "testleader", "Chrome"));
	}
	@Test
	public void TC12() {
		
		Beoordeling_Testcases TC12 = new Beoordeling_Testcases();
		assertEquals ( "true", TC12.correctinloggen("ACC", "developer", "Chrome"));
	}
	@Test
	public void TC13() {
		
		Beoordeling_Testcases TC13 = new Beoordeling_Testcases();
		assertEquals ( "true", TC13.correctinloggen("ACC", "testanalyst", "Chrome"));
	}
	
	@Test
	public void TC14() {
		
		Beoordeling_Testcases TC14 = new Beoordeling_Testcases();
		assertEquals ( "true", TC14.correctinloggen("ACC", "stakeholder", "Chrome"));
	}
	
	@Test
	public void TC15() {
		
		Beoordeling_Testcases TC15 = new Beoordeling_Testcases();
		assertEquals ( "true", TC15.correctinloggen("ACC", "projectmanager", "Chrome"));
	}
	
	@Test
	public void TC16() {
		
		Beoordeling_Testcases TC16 = new Beoordeling_Testcases();
		assertEquals ( "true", TC16.correctinloggen("ACC", "testleader", "Firefox"));
	}
	
	@Test
	public void TC17() {
		
		Beoordeling_Testcases TC17 = new Beoordeling_Testcases();
		assertEquals ( "true", TC17.correctinloggen("ACC", "developer", "Firefox"));
	}
	@Test
	public void TC18() {
		
		Beoordeling_Testcases TC18 = new Beoordeling_Testcases();
		assertEquals ( "true", TC18.correctinloggen("ACC", "testanalyst", "Firefox"));
	}
	
	@Test
	public void TC19() {
		
		Beoordeling_Testcases TC19 = new Beoordeling_Testcases();
		assertEquals ( "true", TC19.correctinloggen("ACC", "stakeholder", "Firefox"));
	}
	@Test
	public void TC20() {
		
		Beoordeling_Testcases TC20 = new Beoordeling_Testcases();
		assertEquals ( "true", TC20.correctinloggen("ACC", "projectmanager", "Firefox"));
	}
	*/
}
