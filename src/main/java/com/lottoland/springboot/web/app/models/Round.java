package com.lottoland.springboot.web.app.models;

import java.util.Optional;

public class Round {

	private Player player1;
	private Player player2;

	private Optional<Player> winner;

	public Round() {
		super();
		this.player1 = new Player(PlayerType.PLAYER_ONE, Choices.ROCK);
		this.player2 = new Player(PlayerType.PLAYER_TWO, Choices.getRandom());
	}

	public Player getPlayer1() {
		return player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public Optional<Player> getWinner() {
		return winner;
	}

	public void setWinner(Optional<Player> winner) {
		this.winner = winner;
	}


	
	

}
