package com.lottoland.springboot.web.app.services;

import java.util.logging.Logger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import com.lottoland.springboot.web.app.models.Choices;
import com.lottoland.springboot.web.app.models.Player;
import com.lottoland.springboot.web.app.models.Round;

public class GameServiceTest {

	private GameService underTest = new GameServiceImpl();
	private static Logger log = Logger.getLogger(GameServiceTest.class.getName());

	@Test
	void roundTest() {
		Round round = underTest.playRound();
		Choices player1Choice = round.getPlayer1().getChoice();
		Choices player2Choice = round.getPlayer2().getChoice();

		Assertions.assertEquals(Choices.ROCK, player1Choice);
		Assertions.assertTrue(Choices.getValues().contains(player2Choice));

		log.info("Player 1 choose: " + player1Choice.name());
		log.info("Player 2 choose: " + player2Choice.name());
		
		Player winner = round.getWinner().orElse(null);
		switch (round.getPlayer2().getChoice()) {
		case PAPER:
			Assertions.assertTrue(round.getWinner().isPresent());
			Assertions.assertEquals(winner, round.getPlayer2());
			log.info(winner.toString());
			break;
		case SCISSORS:
			Assertions.assertTrue(round.getWinner().isPresent());
			Assertions.assertEquals(winner, round.getPlayer1());
			log.info(winner.toString());
			break;
		case ROCK:
			Assertions.assertTrue(round.getWinner().isEmpty());
			Assertions.assertEquals(winner, null);
			log.info("Draw!");
		}
	

	}

}
