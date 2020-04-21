package CS_348_SP_2020.CIExercise;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import CS_348_SP_2020.CIExercise.EndsWith7;

public class EndsWith7Test {

	@Test
	public void testToString() {
		EndsWith7 seven = new EndsWith7();
		// add your name to the expected string, after all the other names in the form John Smith\n
		assertEquals("EndsWith7 [names=]", seven.toString());
	}

}
