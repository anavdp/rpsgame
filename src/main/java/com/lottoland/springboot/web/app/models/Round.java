package com.lottoland.springboot.web.app.models;

public class Round {

	Player player1;
	Player player2;

	Player winner;

	public Round() {
		super();
		this.player1 = new Player("Player 1", Choices.ROCK);
		this.player2 = new Player("Player 2", Choices.getRandom());
	}

	public Player getPlayer1() {
		return player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setWinner(Player winner) {
		this.winner = winner;
	}

	public Player getWinner() {
		return winner;
	}
	
	

}
