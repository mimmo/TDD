package TDD.part3.passwords;

public class LenghtValidator {

	private int _limit;

	public LenghtValidator(int i) {
		_limit = i;
	}

	public boolean validate(String string) {
		return string.length() > _limit;
	}

}
