package TDD.part1.passwords;

import java.util.List;

import TDD.part1.passwords.validator.AndOf;
import TDD.part1.passwords.validator.ContainsLetter;
import TDD.part1.passwords.validator.ContainsLowerCaseLetter;
import TDD.part1.passwords.validator.ContainsNumber;
import TDD.part1.passwords.validator.ContainsUpperCaseLetter;
import TDD.part1.passwords.validator.GreaterThen;
import TDD.part1.passwords.validator.Lenght;
import TDD.part1.passwords.validator.OnlyNumbers;
import TDD.part1.passwords.validator.OrOf;
import TDD.part1.passwords.validator.Validator;

public class ValidatorFactory {

	public static Validator password() {
		return new AndOf((
			List.of(
				new OrOf(List.of(
						new Lenght(8),
						new GreaterThen(7)
					)
				),
				new ContainsNumber(),
				new ContainsLetter(),
				new ContainsUpperCaseLetter(),
				new ContainsLowerCaseLetter()
				)
			));
	}

	public static Validator pin() {
		return new AndOf((
			List.of(
				new Lenght(6),
				new OnlyNumbers()
				)
			));
	}

}
