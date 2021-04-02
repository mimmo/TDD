package TDD.part1.passwords;

import java.util.List;

public class PasswordValidator {

	private List<Validator> _validators;

	public PasswordValidator(List<Validator> validators) {
		_validators = validators;
	}

	public boolean isValid(String value) {
		return _validators.stream().allMatch( v -> v.isValid(value));
	}

}
