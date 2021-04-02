package TDD.part1.passwords;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import TDD.part1.passwords.validator.Validator;

public class ValidatorTest {

	@Test
	public void password() {
		Validator passwordValidator = ValidatorFactory.password();
		assertThat(passwordValidator.isValid("a1B2e3ta")).isTrue();
		assertThat(passwordValidator.isValid("a1b2e3")).isFalse();
	}

	@Test
	public void pin() {
		Validator validator = ValidatorFactory.pin();

		assertThat(validator.isValid("123456")).isTrue();

		assertThat(validator.isValid("12345")).isFalse();
		assertThat(validator.isValid("12345a")).isFalse();
		assertThat(validator.isValid("1234567")).isFalse();
		assertThat(validator.isValid("a1")).isFalse();
		assertThat(validator.isValid("abc")).isFalse();
		assertThat(validator.isValid("")).isFalse();
	}

}
