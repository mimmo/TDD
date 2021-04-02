package TDD.part1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PasswordValidatorTest {

	@Test
	void test() {
		PasswordValidator passwordValidator = new PasswordValidator("");

		passwordValidator.execute();

		assertThat(passwordValidator.execute()).isFalse();
		assertThat(passwordValidator.errors().get("length")).isEqualTo("length must be greater than 7");
	}

}
