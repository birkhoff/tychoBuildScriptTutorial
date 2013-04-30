package tutorial;

import static org.junit.Assert.*;
import org.junit.Test;
import tutorial.bundle.*;

public class SimpleTest {

	@Test
	public void testPerspectiveID() {
		
		assertEquals( "tutorial.bundle.perspective", new ApplicationWorkbenchAdvisor().getInitialWindowPerspectiveId() );
	}

}
