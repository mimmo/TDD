package TDD.part5;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class BowlingTest {

	@Test
	public void rollDoesNotHitAnyPin() {
		Bowling game = new Bowling();

		game.roll(0);

		assertThat(game.score()).isEqualTo(0);
	}

	@Test
	public void rollHitOnePin() {
		Bowling game = new Bowling();

		game.roll(1);

		assertThat(game.score()).isEqualTo(1);
	}

	@Test
	public void rollHitTwoPin() {
		Bowling game = new Bowling();

		game.roll(2);

		assertThat(game.score()).isEqualTo(2);
	}

	@Test
	public void rollHitOnePinAfterRolled() {
		Bowling game = new Bowling();
		game.roll(1);

		game.roll(1);

		assertThat(game.score()).isEqualTo(2);
	}

	@Test
	public void rollDecreaseTotalRolls() {
		Bowling game = new Bowling();

		game.roll(1);

		assertThat(game.totalRolls()).isEqualTo(19);
	}

	@Test
	public void whenStrikeBonusIs2() {
		Bowling game = new Bowling();

		game.roll(10);

		assertThat(game.bonus()).isEqualTo(2);
	}

	@Test
	public void whenStrikeTotalRollsIsDecreasedBy2() {
		Bowling game = new Bowling();

		game.roll(10);

		assertThat(game.totalRolls()).isEqualTo(18);
	}

	@Test
	public void whenSpareBonusIs1() {
		Bowling game = new Bowling();
		game.roll(2);

		game.roll(8);

		assertThat(game.bonus()).isEqualTo(1);
	}

	@Test
	public void whenKnocksDownOnePinAfterStrikeBonusIsDecreasedBy1() {
		Bowling game = new Bowling();
		game.roll(10);

		game.roll(1);

		assertThat(game.bonus()).isEqualTo(1);
	}

	@Test
	public void knocksDownOnePinAfterStrikeBonusCalculationAddedToScore() {
		Bowling game = new Bowling();
		game.roll(10);

		game.roll(1);

		assertThat(game.score()).isEqualTo(12);
	}

	@Test
	public void whenKnocksDownOnePinAfterStrikeAndRollBonusis0() {
		Bowling game = new Bowling();
		game.roll(10);
		game.roll(1);

		game.roll(1);

		assertThat(game.bonus()).isEqualTo(0);
	}

	@Test
	public void knocksDownOnePinAfterStrikeAndRollBonusCalculationAddedToScore() {
		Bowling game = new Bowling();
		game.roll(10);
		game.roll(1);

		game.roll(1);

		assertThat(game.score()).isEqualTo(14);
	}

	@Test
	public void whenKnocksDownOnePinAfterSpareBonusIs0() {
		Bowling game = new Bowling();
		game.roll(5);
		game.roll(5);

		game.roll(1);

		assertThat(game.bonus()).isEqualTo(0);
	}

	@Test
	public void knocksDownOnePinAfterSpareBonusCalculationAddedToScore() {
		Bowling game = new Bowling();
		game.roll(5);
		game.roll(5);

		game.roll(1);

		assertThat(game.score()).isEqualTo(12);
	}

	@Test
	public void strikeAfterStrike() {
		Bowling game = new Bowling();
		game.roll(10);

		game.roll(10);

		assertThat(game.bonus()).isEqualTo(3);
	}

	@Test
	public void strikeAfterStrikeBonusCalculationAddedToScore() {
		Bowling game = new Bowling();
		game.roll(10);

		game.roll(10);

		assertThat(game.score()).isEqualTo(30);
	}

	@Test
	public void strikeAfterStrikeAndTwoRolls() throws Exception {
		Bowling game = new Bowling();
		game.roll(10);
		game.roll(10);

		game.roll(5);
		game.roll(2);

		assertThat(game.score()).isEqualTo(49);
		assertThat(game.bonus()).isEqualTo(0);
	}

	@Test
	public void strikeAfterStrikeAfterStrikeAndTwoRolls() throws Exception {
		Bowling game = new Bowling();
		game.roll(10);
		game.roll(10);
		game.roll(10);

		game.roll(5);
		game.roll(2);

		assertThat(game.score()).isEqualTo(79);
		assertThat(game.bonus()).isEqualTo(0);
	}

	@Test
	public void scoringBowling() {
		Bowling game = new Bowling();
		game.roll(1);
		game.roll(4);
		game.roll(4);
		game.roll(5);
		game.roll(6);
		game.roll(4);
		game.roll(5);
		game.roll(5);
		game.roll(10);
		game.roll(0);
		game.roll(1);
		game.roll(7);
		game.roll(3);
		game.roll(6);
		game.roll(4);
		game.roll(10);
		game.roll(2);
		game.roll(8);
//		game.roll(6);

		assertThat(game.score()).isEqualTo(127);
	}
}
