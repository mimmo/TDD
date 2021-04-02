package TDD.part1.passwords.validator;

public class Lenght implements Validator{

	private int _length;

	public Lenght(int length) {
		_length = length;
	}

	@Override
	public boolean isValid(String value) {
		return value.length() == _length;
	}

}
