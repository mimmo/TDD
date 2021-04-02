package TDD.part1.passwords;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ValidatorsTest {

	@Test
	public void lengthValidator() {
		LenghtValidator lengthValidator = new LenghtValidator(2);

		assertThat(lengthValidator.isValid("123")).isTrue();

		assertThat(lengthValidator.isValid("1")).isFalse();
		assertThat(lengthValidator.isValid("12")).isFalse();
		assertThat(lengthValidator.isValid("")).isFalse();
	}

	@Test
	public void containsNumberValidator() {
		Validator containsNumberValidator = new ContainsNumberValidator();

		assertThat(containsNumberValidator.isValid("1")).isTrue();
		assertThat(containsNumberValidator.isValid("123")).isTrue();
		assertThat(containsNumberValidator.isValid("a1")).isTrue();

		assertThat(containsNumberValidator.isValid("aa")).isFalse();
		assertThat(containsNumberValidator.isValid("")).isFalse();
	}

	@Test
	public void containsLettersValidator() {
		ContainsLettersValidator containsLettersValidator = new ContainsLettersValidator();

		assertThat(containsLettersValidator.isValid("a")).isTrue();
		assertThat(containsLettersValidator.isValid("abc")).isTrue();
		assertThat(containsLettersValidator.isValid("1a")).isTrue();
		assertThat(containsLettersValidator.isValid("A")).isTrue();
		assertThat(containsLettersValidator.isValid("aBc")).isTrue();
		assertThat(containsLettersValidator.isValid("1Bc")).isTrue();

		assertThat(containsLettersValidator.isValid("1")).isFalse();
		assertThat(containsLettersValidator.isValid("123")).isFalse();
		assertThat(containsLettersValidator.isValid("")).isFalse();
	}


}
