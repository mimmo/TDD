package TDD.part1.passwords.validator;

import java.util.List;

public class AndOf implements Validator {

	private List<Validator> _validators;

	public AndOf(List<Validator> validators) {
		_validators = validators;
	}

	@Override
	public boolean isValid(String value) {
		return _validators.stream().allMatch( v -> v.isValid(value));
	}


}
