package TDD.part3.passwords;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LengthValidatorTest {

	@Test
	public void lengthNotValid() {
		LenghtValidator validator = new LenghtValidator(2);

		assertFalse(validator.validate("p"));
		assertFalse(validator.validate("pp"));
	}

	@Test
	public void lengthOk() throws Exception {
		String password = "12345678";

		LenghtValidator validator = new LenghtValidator(7);

		assertTrue(validator.validate(password));
	}

}
