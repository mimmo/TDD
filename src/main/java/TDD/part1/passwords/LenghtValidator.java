package TDD.part1.passwords;

public class LenghtValidator implements Validator {

	private int _length;

	public LenghtValidator(int i) {
		_length = i;
	}

	@Override
	public boolean isValid(String value) {
		return value.length() > _length;
	}

}
