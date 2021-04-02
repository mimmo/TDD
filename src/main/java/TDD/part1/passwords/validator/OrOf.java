package TDD.part1.passwords.validator;

import java.util.List;

public class OrOf implements Validator {

	private List<Validator> _validators;

	public OrOf(List<Validator> validators) {
		_validators = validators;
	}

	@Override
	public boolean isValid(String value) {
		return _validators.stream().anyMatch(v -> v.isValid(value));
	}

}
