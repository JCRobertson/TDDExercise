import static org.junit.Assert.*;

import org.junit.Test;


public class PatTest {

	@Test
	public void matchTest() {
		assertEquals(0, Pat.pat("Hello", "Hell"));
	}
	
	@Test
	public void multipleMatchTest() {
		assertEquals(2, Pat.pat("Hello", "llo"));
		
	}
	
	@Test
	public void notInSubjectTest(){
		assertEquals(-1, Pat.pat("Hello", "Test"));
	}

	@Test (expected = NullPointerException.class)
	public void nullSubjectTest(){
		Pat.pat(null, "Test");
		fail();
	}
	
	@Test (expected = NullPointerException.class)
	public void nullPatternTest(){
		Pat.pat("Hello", null);
		fail();
	}
	
	@Test 
	public void emptySubjectTest(){
		assertEquals(-1, Pat.pat("", "blah"));
	}
	
	@Test 
	public void emptyPatternTest(){
		assertEquals(-1, Pat.pat("asdf", ""));
	}
}
