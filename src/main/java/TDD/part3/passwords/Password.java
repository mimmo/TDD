package TDD.part3.passwords;

public class Password {

	public boolean validate(String string) {
		return new LenghtValidator(7).validate(string);
	}

}
