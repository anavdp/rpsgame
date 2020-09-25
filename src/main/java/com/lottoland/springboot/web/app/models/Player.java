package com.lottoland.springboot.web.app.models;

public class Player {
	PlayerType name;
	Choices choice;

	public Player(PlayerType name, Choices choice) {
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


	public PlayerType getName() {
		return name;
	}

	public void setName(PlayerType name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		return getName() + " wins";
	}
	
	
	
	
	

}
