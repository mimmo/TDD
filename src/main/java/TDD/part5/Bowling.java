package TDD.part5;

public class Bowling {
	private int _score;
	private int _totalRolls;
	private int _totalPins;
	private int _pins;
	private int _bonus;

	public Bowling() {
		_score = 0;
		_totalRolls = 20;
		_totalPins = 10;
		_pins = _totalPins;
	}

	public void roll(int knockedPins) {
		resetPins();
		_totalRolls--;

		calculateScore(knockedPins);

		if (knockedPins == _totalPins) {
			_totalRolls--;
			_pins = 0;
			_bonus += 2;
		}

		if (knockedPins == _pins) {
			_bonus = 1;
		}

		_pins -= knockedPins;
	}

	public void resetPins() {
		if(_totalRolls % 2 == 0) {
			_pins = _totalPins;
		}
	}

	private void calculateScore(int knockedPins) {
		_score += knockedPins;

		int bon = (_bonus > 1) ? (_bonus - 1) : _bonus;

		_score += knockedPins * bon;
		_bonus -= bon;
	}

	public int score() {
		return _score;
	}

	public int totalRolls() {
		return _totalRolls;
	}

	public int bonus() {
		return _bonus;
	}

}
