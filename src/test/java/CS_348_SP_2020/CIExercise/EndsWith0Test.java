package CS_348_SP_2020.CIExercise;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import CS_348_SP_2020.CIExercise.EndsWith0;

public class EndsWith0Test {

	@Test
	public void testToString() {
		EndsWith0 zero = new EndsWith0();
		// add your name to the expected string, after all the other names in the form John Smith\n
		assertEquals("EndsWith0 [names=]", zero.toString());

	}

}
