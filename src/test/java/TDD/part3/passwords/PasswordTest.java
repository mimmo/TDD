package TDD.part3.passwords;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PasswordTest {

	@Test
	public void passwordValid() {
		Password password = new Password();
		assertTrue(password.validate("12345678"));
	}
}
