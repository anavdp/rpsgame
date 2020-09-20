package com.lottoland.springboot.web.app.services;

import org.springframework.stereotype.Service;

import com.lottoland.springboot.web.app.models.Round;

@Service
public class GameServiceImpl implements GameService {

	@Override
	public Round playRound() {
		Round round = new Round();
		switch (round.getPlayer2().getChoice()) {
		case PAPER:
			round.setWinner(round.getPlayer2());
			break;
		case SCISSORS:
			round.setWinner(round.getPlayer1());
			break;
		case ROCK:
			round.setWinner(null);
		}
		return round;
	}

}
