package TDD.part1.passwords.validator;

public class ContainsLetter implements Validator {

	@Override
	public boolean isValid(String value) {
		return value.matches(".*[a-zA-Z]+.*");
	}

}
