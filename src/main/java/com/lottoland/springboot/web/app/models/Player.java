package com.lottoland.springboot.web.app.models;

public class Player {
	String name;
	Choices choice;
	int wins;
	int loss;

	public Player(String name, Choices choice) {
		super();
		this.name = name;
		this.choice = choice;
	}

	public Choices getChoice() {
		return choice;
	}

	public void setChoice(Choices choice) {
		this.choice = choice;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLoss() {
		return loss;
	}

	public void setLoss(int loss) {
		this.loss = loss;
	}

	@Override
	public String toString() {
		if (name.isBlank()) {
			return "";
		}
		return name + " wins!!";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	

}
