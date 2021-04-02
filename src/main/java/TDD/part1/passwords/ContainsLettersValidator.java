package TDD.part1.passwords;

public class ContainsLettersValidator implements Validator {

	@Override
	public boolean isValid(String value) {
		return value.matches(".*[a-zA-Z]+.*");
	}

}
