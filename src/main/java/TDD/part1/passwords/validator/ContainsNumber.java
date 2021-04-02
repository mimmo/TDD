package TDD.part1.passwords.validator;

public class ContainsNumber implements Validator {

	@Override
	public boolean isValid(String value) {
		return value.matches(".*\\d.*");
	}

}
