package TDD.part1.passwords;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

import TDD.part1.passwords.validator.ContainsLetter;
import TDD.part1.passwords.validator.ContainsLowerCaseLetter;
import TDD.part1.passwords.validator.ContainsNumber;
import TDD.part1.passwords.validator.ContainsUpperCaseLetter;
import TDD.part1.passwords.validator.GreaterThen;
import TDD.part1.passwords.validator.Lenght;
import TDD.part1.passwords.validator.OnlyNumbers;
import TDD.part1.passwords.validator.OrOf;
import TDD.part1.passwords.validator.Validator;

public class ValidatorsTest {

	@Test
	public void length() {
		Lenght lengthValidator = new Lenght(2);

		assertThat(lengthValidator.isValid("12")).isTrue();

		assertThat(lengthValidator.isValid("1")).isFalse();
		assertThat(lengthValidator.isValid("123")).isFalse();
		assertThat(lengthValidator.isValid("")).isFalse();
	}

	@Test
	public void minLength() {
		GreaterThen lengthValidator = new GreaterThen(2);

		assertThat(lengthValidator.isValid("123")).isTrue();

		assertThat(lengthValidator.isValid("1")).isFalse();
		assertThat(lengthValidator.isValid("12")).isFalse();
		assertThat(lengthValidator.isValid("")).isFalse();
	}

	@Test
	public void containsLetter() {
		ContainsLetter containsLettersValidator = new ContainsLetter();

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

	@Test
	public void containsUpperCaseLetter() {
		ContainsUpperCaseLetter containsUpperCaseLetter = new ContainsUpperCaseLetter();

		assertThat(containsUpperCaseLetter.isValid("A")).isTrue();
		assertThat(containsUpperCaseLetter.isValid("ABC")).isTrue();
		assertThat(containsUpperCaseLetter.isValid("aB1")).isTrue();

		assertThat(containsUpperCaseLetter.isValid("a")).isFalse();
		assertThat(containsUpperCaseLetter.isValid("")).isFalse();
		assertThat(containsUpperCaseLetter.isValid("1")).isFalse();
	}

	@Test
	public void containsLowerCaseLetter() {
		ContainsLowerCaseLetter containsLowerCaseLetter = new ContainsLowerCaseLetter();

		assertThat(containsLowerCaseLetter.isValid("a")).isTrue();
		assertThat(containsLowerCaseLetter.isValid("abc")).isTrue();
		assertThat(containsLowerCaseLetter.isValid("aB1")).isTrue();

		assertThat(containsLowerCaseLetter.isValid("A")).isFalse();
		assertThat(containsLowerCaseLetter.isValid("")).isFalse();
		assertThat(containsLowerCaseLetter.isValid("1")).isFalse();
	}

	@Test
	public void containsNumber() {
		Validator containsNumberValidator = new ContainsNumber();

		assertThat(containsNumberValidator.isValid("1")).isTrue();
		assertThat(containsNumberValidator.isValid("123")).isTrue();
		assertThat(containsNumberValidator.isValid("a1")).isTrue();

		assertThat(containsNumberValidator.isValid("aa")).isFalse();
		assertThat(containsNumberValidator.isValid("")).isFalse();
	}

	@Test
	public void onlyNumbers() {
		OnlyNumbers validator = new OnlyNumbers();

		assertThat(validator.isValid("1")).isTrue();
		assertThat(validator.isValid("12")).isTrue();

		assertThat(validator.isValid("a")).isFalse();
		assertThat(validator.isValid("1a")).isFalse();
		assertThat(validator.isValid("")).isFalse();
	}

	@Test
	public void orOf() {
		assertThat(new OrOf(List.of(s -> true)).isValid("")).isTrue();
		assertThat(new OrOf(List.of(s -> false)).isValid("")).isFalse();
		assertThat(new OrOf(List.of(s -> true, s -> true)).isValid("")).isTrue();
		assertThat(new OrOf(List.of(s -> false, s -> true)).isValid("")).isTrue();
		assertThat(new OrOf(List.of(s -> false, s -> false)).isValid("")).isFalse();
	}
}
