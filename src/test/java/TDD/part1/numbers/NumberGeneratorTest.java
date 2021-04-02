package TDD.part1.numbers;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

import TDD.part1.numbers.NumberGenerator;

public class NumberGeneratorTest {

	@Test
	public void generateNumbersFrom0To1() {
		int start = 0;
		int end = 1;
		assertThat(new NumberGenerator().generate(start, end)).isEqualTo(List.of(0,1));
	}

	@Test
	public void generateNumbersFrom0To2() {
		int start = 0;
		int end = 2;
		assertThat(new NumberGenerator().generate(start, end)).isEqualTo(List.of(0,1,2));
	}

}
