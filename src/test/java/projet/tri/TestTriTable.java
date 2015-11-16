/**
 * 
 */
package projet.tri;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

/**
 * @author Latixel
 *
 */
public class TestTriTable {

	/**
	 * Test method for {@link projet.tri.TriTabl#triArray(java.util.ArrayList)}.
	 * @throws NullArgumentException 
	 */
	@Test(expected = NullArgumentException.class)
	public void testTriArray_Null() throws NullArgumentException {
		TriTabl.triArray(null);
	}

	@SuppressWarnings("rawtypes")
	@Test
	public void testTriTable_int() {
		ArrayList<Comparable> tablInt = new ArrayList<Comparable>(Arrays.asList(new Integer[] {5,874,652,44,0}));
		ArrayList<Comparable> tablTrier = new ArrayList<Comparable>(Arrays.asList(new Integer[] {0, 5, 44, 652, 874}));
		try {
			TriTabl.triArray(tablInt);
		} catch (NullArgumentException e) {
			e.printStackTrace();
			fail("Exception TriTabl : " + e);
		}
		assertFalse(TestTriTable.compareArrayList(tablInt, tablTrier));
	}
	
	@SuppressWarnings("rawtypes")
	@Test
	public void testTriTable_string() {
		ArrayList<Comparable> tablString = new ArrayList<Comparable>(Arrays.asList(new String[] {"aaa", "sgj", "564cv", "az"}));
		ArrayList<Comparable> tablTrier = new ArrayList<Comparable>(Arrays.asList(new String[] {"564cv", "az", "aaa", "sgj"}));
		try {
			TriTabl.triArray(tablString);
		} catch (NullArgumentException e) {
			e.printStackTrace();
			fail("Exception TriTabl : " + e);
		}
		assertFalse(TestTriTable.compareArrayList(tablString, tablTrier));
	}
	
	
	@SuppressWarnings("rawtypes")
	private static boolean compareArrayList(ArrayList list1, ArrayList list2) {
		if(list1.size() != list2.size())
			return false;
		for(int i = 0 ; i < list1.size() ; i++)
			if(list1.get(i) != list2.get(i))
				return false;
		return true;
	}
}
