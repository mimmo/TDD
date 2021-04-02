package TDD.part1.passwords.validator;

public class OnlyNumbers implements Validator {

	@Override
	public boolean isValid(String value) {
		return value.matches("\\d+");
	}

}
