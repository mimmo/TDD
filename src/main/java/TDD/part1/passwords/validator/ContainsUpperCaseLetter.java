package TDD.part1.passwords.validator;

public class ContainsUpperCaseLetter implements Validator {

	@Override
	public boolean isValid(String value) {
		return value.matches(".*[A-Z].*");
	}

}
