package TDD.part1.passwords.validator;

public class ContainsLowerCaseLetter implements Validator {

	@Override
	public boolean isValid(String value) {
		return value.matches(".*[a-z].*");
	}

}
