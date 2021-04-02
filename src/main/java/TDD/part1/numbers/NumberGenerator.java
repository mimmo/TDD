package TDD.part1.numbers;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class NumberGenerator {
	private List<Integer> _numbers;

	public NumberGenerator() {
		_numbers = new LinkedList<>();
	}

	public List<Integer> generate(int from, int to) {
		IntStream.rangeClosed(from, to).forEach(n -> _numbers.add(n));
		return _numbers;
	}

}
