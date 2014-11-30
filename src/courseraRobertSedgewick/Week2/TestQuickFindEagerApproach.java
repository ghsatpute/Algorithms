/**
 * @Author Ganesh Satpute
 * @Date Nov 30, 2014
 */
package courseraRobertSedgewick.Week2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Ganesh
 *
 */
public class TestQuickFindEagerApproach {

	QuickFindEagerApproach quickFind;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		// create object 
		quickFind = new QuickFindEagerApproach(8);
		quickFind.union(1,4);
		quickFind.union(5, 7);
		quickFind.union(2, 0);
		// After setting up array should look like
		//| 2 | 4 | 2 | 4 | 8 | 7 | 6 | 7 |
		//  0   1   2   3   4   5   6   7
	}

	@Test
	public void testFind() {
		assertTrue(quickFind.connected(1, 4));
		assertTrue(quickFind.connected(5, 7));
		assertFalse(quickFind.connected(5, 4));
		assertFalse(quickFind.connected(0, 7));
		assertFalse(quickFind.connected(3, 6));
	}
	
	public void testUnion() {
		quickFind.union(1,2);
		assertTrue(quickFind.connected(4,0));
		assertTrue(quickFind.connected(4, 2));
	}
}
