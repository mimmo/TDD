package TDD.part1.passwords;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

public class PasswordValidatorTest {

	@Test
	public void passwordValidatorTest() {
		PasswordValidator passwordValidator = new PasswordValidator(
			List.of(
				new LenghtValidator(2),
				new ContainsNumberValidator(),
				new ContainsLettersValidator()
				)
		);

		assertThat(passwordValidator.isValid("a1b")).isTrue();

		assertThat(passwordValidator.isValid("a1")).isFalse();
		assertThat(passwordValidator.isValid("abc")).isFalse();
		assertThat(passwordValidator.isValid("123")).isFalse();
	}

}
