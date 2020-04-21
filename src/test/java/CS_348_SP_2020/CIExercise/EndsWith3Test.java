
package CS_348_SP_2020.CIExercise;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import CS_348_SP_2020.CIExercise.EndsWith3;

public class EndsWith3Test {

	@Test
	public void testToString() {
		EndsWith3 three = new EndsWith3();
		// add your name to the expected string, after all the other names in the form John Smith\n
		assertEquals("EndsWith3 [names=]", three.toString());
	}

}
