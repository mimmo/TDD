package TDD.part1.passwords;

public class ContainsNumberValidator implements Validator {

	@Override
	public boolean isValid(String value) {
		return value.matches(".*\\d.*");
	}

}
