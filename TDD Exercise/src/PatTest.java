import static org.junit.Assert.*;

import org.junit.Test;


public class PatTest {

	@Test
	public void matchTest() {
		assertEquals(0, Pat.pat("Hello", "Hell"));
	}

}
