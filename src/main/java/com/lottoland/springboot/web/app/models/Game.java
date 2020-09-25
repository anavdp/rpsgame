package com.lottoland.springboot.web.app.models;

import java.util.ArrayList;
import java.util.List;

public class Game {
	
	private List<Round> rounds;
	

	public Game() {
		super();
		this.rounds = new ArrayList<Round>();
	}

	public List<Round> getRounds() {
		return rounds;
	}

	public void setRounds(List<Round> rounds) {
		this.rounds = rounds;
	}
	
	
}
