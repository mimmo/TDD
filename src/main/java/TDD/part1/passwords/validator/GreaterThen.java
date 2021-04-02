package TDD.part1.passwords.validator;

public class GreaterThen implements Validator {

	private int _length;

	public GreaterThen(int i) {
		_length = i;
	}

	@Override
	public boolean isValid(String value) {
		return value.length() >_length;
	}

}
