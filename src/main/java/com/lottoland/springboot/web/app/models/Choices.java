package com.lottoland.springboot.web.app.models;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public enum Choices {
	ROCK, PAPER, SCISSORS;

	private static final int SIZE = getValues().size();

	public static List<Choices> getValues() {
		return Arrays.asList(Choices.values());
	}

	public static Choices getRandom() {
		Random random = new Random();
		return getValues().get(random.nextInt(SIZE));
	}
}
